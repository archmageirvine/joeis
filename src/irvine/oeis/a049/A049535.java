package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049535 Starts of runs of exactly 6 consecutive nonsquarefree numbers.
 * @author Sean A. Irvine
 */
public class A049535 extends Sequence1 {

  private final boolean[] mIsSquareFree;
  private long mN = 0;

  protected A049535(final int repeats) {
    mIsSquareFree = new boolean[repeats + 2];
    for (int k = 0; k < mIsSquareFree.length; ++k) {
      mIsSquareFree[k] = Jaguar.factor(++mN).isSquareFree();
    }
  }

  /** Construct the sequence. */
  public A049535() {
    this(6);
  }

  private boolean isExact() {
    if (!mIsSquareFree[0] || !mIsSquareFree[mIsSquareFree.length - 1]) {
      return false;
    }
    for (int k = 1; k < mIsSquareFree.length - 1; ++k) {
      if (mIsSquareFree[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    do {
      System.arraycopy(mIsSquareFree, 1, mIsSquareFree, 0, mIsSquareFree.length - 1);
      mIsSquareFree[mIsSquareFree.length - 1] = Jaguar.factor(++mN).isSquareFree();
    } while (!isExact());
    return Z.valueOf(mN - mIsSquareFree.length + 2);
  }
}

