package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;

/**
 * A086451 Numbers not in A086335.
 * @author Sean A. Irvine
 */
public class A086451 extends A086335 {

  private final HashSet<Z> mA = new HashSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mN = Z.ZERO;

  private void add(final Z n) {
    if (mReported.contains(n)) {
      throw new RuntimeException("Previously reported " + n + " was incorrect");
    }
    mA.add(n);
  }

  @Override
  public Z next() {
    while (true) {
      add(super.next());
      add(super.next());
      add(super.next());
      mN = mN.add(1);
      if (!mA.remove(mN)) {
        mReported.add(mN);
        return mN;
      }
    }
  }
}

