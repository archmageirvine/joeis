package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicShortArray;

/**
 * A001212 a(n) = solution to the postage stamp problem with n denominations and 2 stamps.
 * @author Sean A. Irvine
 */
public class A001212 implements Sequence {

  private final DynamicShortArray mRepresentations = new DynamicShortArray();
  private int mDenominations = 0;
  private int mBest = 0;

  protected void increment(final int k) {
    final short b = mRepresentations.get(k);
    if (b == 32767) {
      throw new ArithmeticException(); // overflow
    }
    mRepresentations.set(k, (short) (b + 1));
  }

  protected void decrement(final int k) {
    mRepresentations.set(k, (short) (mRepresentations.get(k) - 1));
  }

  protected void add(final int[] workspace, final int memberCount, final int k) {
    workspace[memberCount] = k;
    increment(k);
    for (int j = 0; j <= memberCount; ++j) {
      final int sum = k + workspace[j];
      increment(sum);
    }
  }

  protected void remove(final int[] workspace, final int memberCount, final int k, final int fg) {
    for (int j = 0; j <= memberCount; ++j) {
      final int sum = k + workspace[j];
      decrement(sum);
    }
    decrement(k);
  }

  private void search(final int[] workspace, final int memberCount, final int largestMember, final int firstGap) {
    if (memberCount == workspace.length) {
      if (firstGap > mBest) {
        mBest = firstGap - 1;
        //System.out.println(mDenominations + " " + Arrays.toString(workspace) + " " + firstGap);
      }
      return;
    }
    for (int k = largestMember + 1; k <= firstGap; ++k) {
      // Try adding k to the basis
      add(workspace, memberCount, k);
      int fg = firstGap;
      while (mRepresentations.get(fg) != 0) {
        ++fg;
      }
      search(workspace, memberCount + 1, k, fg);
      //System.out.println("Adding " + k + " as pos " + memberCount + " first gap is now " + fg);
      remove(workspace, memberCount, k, fg);
    }
  }

  @Override
  public Z next() {
    mBest = 0;
    final int[] workspace = new int[++mDenominations];
    search(workspace, 0, 0, 1);
    return Z.valueOf(mBest);
  }
}

