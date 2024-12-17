package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073693 Product of next a(n) odd numbers plus 2 is prime.
 * @author Sean A. Irvine
 */
public class A073693 extends Sequence0 {

  private long mN = 1;

  @Override
  public Z next() {
    long cnt = 1;
    Z prod = Z.valueOf(mN);
    mN += 2;
    while (!prod.add(2).isProbablePrime()) {
      prod = prod.multiply(mN);
      mN += 2;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
