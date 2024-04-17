package irvine.oeis.a372;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A372011 allocated for Damjan Kokovic.
 * @author Sean A. Irvine
 */
public class A372011 extends Sequence2 {

  private long mN = 1;
  private long mCount = 0;

  private void search(final Z n) {
    if (n.isZero()) {
      for (long k = 1; k < mN; ++k) {
        search(n.multiply(mN).add(k));
      }
    } else if (Z.ONE.equals(n) || n.isProbablePrime()) {
      ++mCount;
      for (long k = 0; k < mN; ++k) {
        search(n.multiply(mN).add(k));
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    mCount = 0;
    search(Z.ZERO);
    return Z.valueOf(mCount);
  }
}
