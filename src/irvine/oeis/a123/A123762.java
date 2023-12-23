package irvine.oeis.a123;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A123762 Number of ways, counted up to symmetry, to build a contiguous building with n LEGO blocks of size 1 X 2.
 * @author Georg Fischer
 */
public class A123762 extends AbstractSequence implements DirectSequence {

  private static final int MAX_BLOCKS = 100; //Maximal number of bricks (unattainable unless b=w=1)
  private final int mMask; // bit mask for optional features
  private final int mW; // width
  private final int mB; // breadth
  private int mOptions; // The size of the bricks studied, and the number of ways to attach one such under another
  private int mN; // The total number of bricks to place, and the number placed this far
  private final int[] mX = new int[MAX_BLOCKS];
  private final int[] mY = new int[MAX_BLOCKS];
  private final int[] mZ = new int[MAX_BLOCKS]; // Location of bricks placed (lower sw corner). The entry at index placed is used as workspace.
  private final boolean[] mHz = new boolean[MAX_BLOCKS]; // Direction of bricks placed in xy-plane. true means w x b, false means b x w
  private final int[] mPaired = new int[MAX_BLOCKS]; // Used when checking symmetry
  private long mCounter; // Total count of configurations. Overflow is unlikely, so no tests are done.
  private int mPlaced;

  /** Construct the sequence. */
  public A123762() {
    this(1, 7, 1, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param mask bit mask for optional features
   * @param w width
   * @param b breadth
   */
  public A123762(final int offset, final int mask, final int w, final int b) {
    super(offset);
    mN = offset - 1;
    mMask = mask;
    mW = w;
    mB = b;
  }

  /**
   * Compute a brick position which is attachable to the brick at entry given by <code>at</code>, using <code>i</code> as an index.
   * <code>i</code> must be between 0 and <code>2*mOptions-1</code>.
   * As <code>i</code> increases, we go over first bricks over and then under the given one.
   * When the brick size is not square, the instances where the two bricks are parallel are taken first.
   * @param at attach to this brick
   * @param i current index
   */
  private void placeRelative(final int at, int i) {
    if (i >= mOptions) { // Downwards
      i -= mOptions;
      mZ[mPlaced] = mZ[at] - 1;
    } else { // Upwards
      mZ[mPlaced] = mZ[at] + 1;
    }
    final int b0;
    final int w0;
    if (i >= (2 * mW - 1) * (2 * mB - 1)) {
      // Perpendicularly (not square)
      i -= (2 * mW - 1) * (2 * mB - 1);
      mHz[mPlaced] = !mHz[at];
      w0 = i / (mB + mW - 1);
      b0 = i % (mB + mW - 1);
    } else {
      // Parallely (or square)
      b0 = i / (2 * mW - 1);
      w0 = i % (2 * mW - 1);
      mHz[mPlaced] = mHz[at];
    }
    if (mHz[mPlaced]) {
      mX[mPlaced] = mX[at] + w0 - mW + 1;
      mY[mPlaced] = mY[at] + b0 - mB + 1;
    } else {
      mY[mPlaced] = mY[at] + w0 - mW + 1;
      mX[mPlaced] = mX[at] + b0 - mB + 1;
    }
  }

  private int xdim(final int i) {
    return mHz[i] ? mW : mB;
  }

  private int ydim(final int i) {
    return mHz[i] ? mB : mW;
  }

  /**
   * Check for overlapping of two bricks.
   * @param i index of first brick
   * @param j index of second brick
   * @return true when the xy-projections of bricks at i and j overlap
   */
  private boolean meetsXY(final int i, final int j) {
    return (!(mX[i] + xdim(i) <= mX[j] || mY[i] + ydim(i) <= mY[j] || mX[i] >= mX[j] + xdim(j) || mY[i] >= mY[j] + ydim(j)));
  }

  /**
   * Check whether a brick is placeable.
   * @param attachable limit for bricks placed before
   * @return true when the brick in workspace (i.e. at index mPlaced) can be attached to building.
   * It must not collide with any other brick, nor could have been attached at an earlier time in the
   * computation.
   */
  private boolean placeable(final int attachable) {
    for (int i = 0; i < mPlaced; i++) {
      if (meetsXY(i, mPlaced)) {
        switch (mZ[i] - mZ[mPlaced]) {
          case 0:
            // Collision
            return false;
          case 1:
          case -1:
            if (i < attachable) {
              // Could have been placed before
              return false;
            }
          default:
            break;
        }
      }
    }
    return (mMask & 8) == 0 || mHz[mPlaced]; // this forces the orientation in one direction
  }

  /**
   * Compute the weight of the configuration:
   * 4 if it is invariant under a rotation of 90 degrees,
   * 2 if it is invariant under a rotation of 180 degrees but not 90,
   * 1 if it isn't invariant under a rotation of 180.
   */
  private int symmetryWeight() {
    int i, j, xmax, xmin, ymax, ymin, x0, y0;
    // Initialization: Compute the smallest box containing all bricks at the same z-level as the first one placed,
    // and set all values of mPaired[i] to -1
    xmin = mX[0];
    ymin = mY[0];
    xmax = mX[0] + xdim(0);
    ymax = mY[0] + ydim(0);
    mPaired[0] = -1;
    for (i = 1; i < mPlaced; i++) {
      mPaired[i] = -1;
      if (mZ[i] == mZ[0]) {
        if (mX[i] < xmin) {
          xmin = mX[i];
        }
        if (mY[i] < ymin) {
          ymin = mY[i];
        }
        if (mX[i] + xdim(i) > xmax) {
          xmax = mX[i] + xdim(i);
        }
        if (mY[i] + ydim(i) > ymax) {
          ymax = mY[i] + ydim(i);
        }
      }
    }
    // Pass one: If the configuration is symmetric after a 180 degree rotation, the center of this rotation
    // must be the center of the box. Test that all bricks are either rotated back to themselves or are rotated
    // to another brick this way. Place index of matching brick(s) in mPaired-array.
    // Return with 1 if this fails at any stage, indicated by a -1 persisting after having tried to find a match.
    for (i = 0; i < mPlaced; i++) {
      if (mPaired[i] < 0) {
        // Coordinates of rotated brick
        x0 = xmax + xmin - mX[i] - xdim(i);
        y0 = ymax + ymin - mY[i] - ydim(i);
        boolean busy = true;
        j = i;
        while (busy && j < mPlaced) {
          if (mX[j] == x0 && mY[j] == y0 && mZ[j] == mZ[i] && mHz[j] == mHz[i]) {
            mPaired[i] = j;
            mPaired[j] = i;
            busy = false;
          }
          j++;
        }
        if (mPaired[i] < 0) {
          return 1;
        }
      }
    }
    // Pass two: We now know the configuration is symmetric after a rotation of 180 degrees and must determine if it is even
    // symmetric after a rotation of 90 degrees. This is only possible if the box is square. We use the pairing found in the
    // first pass: bricks paired with themselves are possible exactly when the bricks are square, so if this is
    // the case we flag back to -1. For the rest we look for the brick which is a 90 degree rotation of the given one. If it
    // exists, it cannot be paired with itself, and all the four involved bricks are flagged with -1.
    // We return 2 if this process fails at any stage, indicated by a persisting non-negative index, and 4 if it doesn't.
    if ((xmax - xmin) != (ymax - ymin)) {
      return 2;
    }
    for (i = 0; i < mPlaced; i++) {
      if (mPaired[i] >= 0) {
        if (mPaired[i] == i) {
          if (mW == mB) {
            mPaired[i] = -1;
          } else {
            return 2;
          }
        }
        x0 = -mY[i] + (ymax + ymin + xmax + xmin) / 2 - ydim(i);
        y0 = mX[i] + (ymax + ymin - xmax - xmin) / 2;
        boolean busy = true;
        j = i + 1;
        while (busy && j < mPlaced) {
          if (mX[j] == x0 && mY[j] == y0 && mZ[j] == mZ[i] && (mW == mB || mHz[j] == !mHz[i])) {
            mPaired[mPaired[i]] = -1;
            mPaired[mPaired[j]] = -1;
            mPaired[i] = -1;
            mPaired[j] = -1;
            busy = false;
          }
          j++;
        }
        if (mPaired[i] >= 0) {
          return 2;
        }
      }
    }
    return 4;
  }

  /**
   * Count configurations recursively adding bricks to index <code>attachFrom</code>. If <code>indexFrom</code> is positive the bricks added
   * to the brick at <code>attachFrom</code> must have an index bigger than or equal to <code>indexFrom</code>,
   * in the sense of the <code>placeRelative()</code> method.
   * Several global variables are used for efficiency.
   */
  private void count(final int attachFrom, int indexFrom) {
    //** System.out.println("attachFrom=" + attachFrom + ", indexFrom=" + indexFrom + ", mPlaced=" + mPlaced);
    if (mN == mPlaced) { // Configuration finished, compute and add weight
      int sw = symmetryWeight();
      //** System.out.println("  sw=" + sw);
      if ((sw & mMask) != 0) {
        mCounter += sw;
      }
    } else { // go through all options for adding the next brick
      for (int buildOn = attachFrom; buildOn < mPlaced; buildOn++) {
        for (int i = indexFrom; i < 2 * mOptions; i++) {
          placeRelative(buildOn, i);
          if (placeable(buildOn)) { // place brick and continue recursively
            mPlaced++;
            count(buildOn, i + 1);
            mPlaced--;
          }
        }
        indexFrom = 0;
      }
    }
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z nz) {
    mN = nz.intValueExact();
    mOptions = ((mW == mB) ? (mW + mB - 1) * (mW + mB - 1) : (mW + mB - 1) * (mW + mB - 1) + (2 * mW - 1) * (2 * mB - 1));
    mX[0] = 0;
    mY[0] = 0;
    mZ[0] = 0;
    mHz[0] = true;
    mCounter = 0;
    mPlaced = 1;
    count(0, 0);
    return Z.valueOf((mCounter / ((long) mN * ((mB == mW) ? 4 : 2))));
  }
}
