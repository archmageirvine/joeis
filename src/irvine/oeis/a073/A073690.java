package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073689.
 * @author Sean A. Irvine
 */
public class A073690 extends Sequence0 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 1;
    Z prod = Z.valueOf(++mN);
    while (!prod.add(1).isProbablePrime()) {
      prod = prod.multiply(++mN);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
