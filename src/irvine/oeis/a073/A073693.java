package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073689.
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
