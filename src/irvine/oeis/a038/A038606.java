package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038606 Least k such that k-th prime &gt; n * k.
 * @author Sean A. Irvine
 */
public class A038606 extends A000040 {

  private long mN = 0;
  private long mPi = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mPi;
      if (super.next().longValueExact() > mN * mPi) {
        return Z.valueOf(mPi);
      }
    }
  }
}
