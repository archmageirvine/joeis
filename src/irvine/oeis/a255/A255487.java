package irvine.oeis.a255;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A255487 Number of polyhypercubes or 4-dimensional polyominoes with n cells (regarding mirror-images as distinct).
 * @author Don Reble
 * @author Sean A. Irvine
 */
public class A255487 extends AbstractSequence {

  /* Construct the sequence. */
  public A255487() {
    super(0);
  }

  // Don Reble original C++ version
  // https://oeis.org/A068870/a068870.txt

  /*
    Count the 4-dimensional polyhypercubes, treating mirror-images as
    different (A255487); but also count the symmetric ones, to get A068870.

    Each Poly has a canonical form, such that two polys are equivalent
    if their canonical forms are identical. Compute it by examining all
    192 rotations of a form:
    - move each rotated Poly close to the origin (coordinates are
      non-negative and minimal),
    - sort the sequence of hypercube coordinates, and
    - take the least of the 192 (using an arbitrary but consistent
      ordering).
  */

  // Coordinate (w,x,y,z) is four 8-bit numbers packed into a int

  private static final int SHIFT1 = 8;
  private static final int SHIFT2 = 2 * SHIFT1;
  private static final int SHIFT3 = 3 * SHIFT1;
  private static final int W_COORD = 1;
  private static final int X_COORD = W_COORD << SHIFT1;
  private static final int Y_COORD = X_COORD << SHIFT1;
  private static final int Z_COORD = Y_COORD << SHIFT1;
  private static final int W_MASK = X_COORD - W_COORD;
  private static final int X_MASK = Y_COORD - X_COORD;
  private static final int Y_MASK = Z_COORD - Y_COORD;
  private static final int Z_MASK = -Z_COORD;

  protected static class PackedPolyomino {
    private final int[] mCoords;
    private int mMin;
    private int mMax;

    PackedPolyomino(final int size) {
      mCoords = new int[size];
    }

    PackedPolyomino copy() {
      final PackedPolyomino p = new PackedPolyomino(mCoords.length);
      System.arraycopy(mCoords, 0, p.mCoords, 0, mCoords.length);
      p.mMin = mMin;
      p.mMax = mMax;
      return p;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof PackedPolyomino && Arrays.equals(mCoords, ((PackedPolyomino) obj).mCoords);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mCoords);
    }

    // Use comparators only on size-Size polys.
    /* set<Poly> and canonicalize() use operator<
       It's an arbitrary but consistent ordering. */
    boolean lt(final PackedPolyomino rhs) {
      for (int k = 0; k < mCoords.length; ++k) {
        final int c = Integer.compare(mCoords[k], rhs.mCoords[k]);
        if (c != 0) {
          return c > 0;
        }
      }
      return false;
    }

    private String coString(final int co) {
      return (co & W_MASK) + " " + ((co & X_MASK) >>> SHIFT1) + " " + ((co & Y_MASK) >>> SHIFT2) + " " + ((co & Z_MASK) >>> SHIFT3);
    }

    @Override
    public String toString() {
      final StringBuilder sb = new StringBuilder();
      for (final int co : mCoords) {
        sb.append(" [").append(coString(co)).append(']');
      }
      sb.append(" {").append(coString(mMin)).append("} {").append(coString(mMax)).append('}');
      return sb.toString();
    }

    private void move(final int displ) {
      for (int cx = 0; cx < mCoords.length; cx += 1) {
        mCoords[cx] += displ;
      }
      mMin += displ;
      mMax += displ;
    }

    private void updateExtrema(final int newco) {
      if ((newco & W_MASK) < (mMin & W_MASK)) {
        mMin = (mMin & ~W_MASK) | (newco & W_MASK);
      }
      if ((newco & W_MASK) > (mMax & W_MASK)) {
        mMax = (mMax & ~W_MASK) | (newco & W_MASK);
      }
      if ((newco & X_MASK) < (mMin & X_MASK)) {
        mMin = (mMin & ~X_MASK) | (newco & X_MASK);
      }
      if ((newco & X_MASK) > (mMax & X_MASK)) {
        mMax = (mMax & ~X_MASK) | (newco & X_MASK);
      }
      if ((newco & Y_MASK) < (mMin & Y_MASK)) {
        mMin = (mMin & ~Y_MASK) | (newco & Y_MASK);
      }
      if ((newco & Y_MASK) > (mMax & Y_MASK)) {
        mMax = (mMax & ~Y_MASK) | (newco & Y_MASK);
      }
      if ((newco & Z_MASK) < (mMin & Z_MASK)) {
        mMin = (mMin & ~Z_MASK) | (newco & Z_MASK);
      }
      if ((newco & Z_MASK) > (mMax & Z_MASK)) {
        mMax = (mMax & ~Z_MASK) | (newco & Z_MASK);
      }
    }

    private PackedPolyomino rotate(final PackedPolyomino canon, final int mask1, final int mask2, final int shift1) {
      final int wmax = mMax & mask1;
      for (int cx = 0; cx < mCoords.length; ++cx) {
        mCoords[cx] = (mCoords[cx] & (~mask1 & ~mask2))
          | ((wmax - (mCoords[cx] & mask1)) << shift1)
          | ((mCoords[cx] & mask2) >> shift1);
      }
      mMax = (mMax & (~mask1 & ~mask2))
        | (wmax << shift1)
        | ((mMax & mask2) >> shift1);
      Arrays.sort(mCoords);
      return lt(canon) ? copy() : canon;
    }

    private PackedPolyomino rotWtoX(final PackedPolyomino canon) {
      return rotate(canon, W_MASK, X_MASK, SHIFT1);
    }

    private PackedPolyomino rotWtoY(final PackedPolyomino canon) {
      return rotate(canon, W_MASK, Y_MASK, SHIFT2);
    }

    private PackedPolyomino rotWtoZ(final PackedPolyomino canon) {
      return rotate(canon, W_MASK, Z_MASK, SHIFT3);
    }

    private PackedPolyomino rotXtoY(final PackedPolyomino canon) {
      return rotate(canon, X_MASK, Y_MASK, SHIFT1);
    }

    private PackedPolyomino rotYtoX(final PackedPolyomino canon) {
      final int ymax = mMax & Y_MASK;
      for (int cx = 0; cx < mCoords.length; ++cx) {
        mCoords[cx] = (mCoords[cx] & (~X_MASK & ~Y_MASK))
          | ((ymax - (mCoords[cx] & Y_MASK)) >> SHIFT1)
          | ((mCoords[cx] & X_MASK) << SHIFT1);
      }
      mMax = (mMax & (~X_MASK & ~Y_MASK))
        | (ymax >> SHIFT1)
        | ((mMax & X_MASK) << SHIFT1);
      Arrays.sort(mCoords);
      return lt(canon) ? copy() : canon;
    }

    private PackedPolyomino rotXtoZ(final PackedPolyomino canon) {
      return rotate(canon, X_MASK, Z_MASK, SHIFT2);
    }

    private PackedPolyomino do2D(final PackedPolyomino canon) {
      return rotWtoX(rotWtoX(rotWtoX(canon)));
    }

    private PackedPolyomino do3D(final PackedPolyomino canon) {
      return do2D(rotWtoY(do2D(rotYtoX(do2D(rotXtoY(do2D(rotXtoY(do2D(rotWtoY(do2D(canon)))))))))));
    }

    private PackedPolyomino do4D(final PackedPolyomino canon) {
      return do3D(rotXtoZ(do3D(rotWtoZ(do3D(rotWtoZ(do3D(rotWtoZ(do3D(rotXtoZ(do3D(rotWtoZ(do3D(rotWtoZ(do3D(canon)))))))))))))));
    }

    private void flipW() {
      final int wmax = mMax & W_MASK;
      for (int cx = 0; cx < mCoords.length; ++cx) {
        mCoords[cx] = (mCoords[cx] & ~W_MASK) | (wmax - (mCoords[cx] & W_MASK));
      }
      Arrays.sort(mCoords);
    }

    PackedPolyomino canonicalize() {
      final PackedPolyomino po = copy();
      po.move(-po.mMin);
      Arrays.sort(po.mCoords);
      return po.do4D(po.copy());
    }

    /**
     * Test if the polyomino is symmetric
     * @return true if symmetric
     */
    public boolean isSymmetric() {
      PackedPolyomino fl = copy();
      fl.flipW();
      fl = fl.canonicalize();
      return equals(fl);
    }

    private void expandPoly(final HashSet<PackedPolyomino> polys) {
      final int prevSize = mCoords.length;
      move(W_COORD + X_COORD + Y_COORD + Z_COORD);
      // so that all adjacent cells exist
      final HashSet<Integer> cellset = new HashSet<>();
      for (final int p : mCoords) {
        cellset.add(p);
      }
      final PackedPolyomino expo = new PackedPolyomino(mCoords.length + 1);
      System.arraycopy(mCoords, 0, expo.mCoords, 0, mCoords.length);
      expo.mMin = mMin;
      expo.mMax = mMax;
      for (int cx = 0; cx < prevSize; cx += 1) {
        final int co = mCoords[cx];
        for (int delta = W_COORD; delta != 0; delta <<= SHIFT1) {
          int exco = co + delta;
          expo.mCoords[prevSize] = exco;
          if (cellset.add(exco)) {
            expo.updateExtrema(exco);
            final PackedPolyomino canon = expo.canonicalize();
            polys.add(canon);
            expo.mMin = mMin;
            expo.mMax = mMax;
          }
          exco = co - delta;
          expo.mCoords[prevSize] = exco;
          if (cellset.add(exco)) {
            expo.updateExtrema(exco);
            final PackedPolyomino canon = expo.canonicalize();
            polys.add(canon);
            expo.mMin = mMin;
            expo.mMax = mMax;
          }
        }
      }
    }

  }

  private HashSet<PackedPolyomino> mPolysA = null;
  protected HashSet<PackedPolyomino> mPolysB = null;

  private void expandPolys() {
    for (final PackedPolyomino poly : mPolysA) {
      poly.expandPoly(mPolysB);
    }
  }

  @Override
  public Z next() {
    if (mPolysB == null) {
      mPolysB = new HashSet<>();
      return Z.ONE;
    }
    if (mPolysB.isEmpty()) {
      final PackedPolyomino po = new PackedPolyomino(1);
      po.mCoords[0] = 0;
      po.mMin = 0;
      po.mMax = 0;
      mPolysB.add(po);
    } else {
      mPolysA = mPolysB;
      mPolysB = new HashSet<>();
      expandPolys();
    }
    return Z.valueOf(mPolysB.size());
  }

}
