package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073571.
 * @author Sean A. Irvine
 */
public class A073741 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    do {
      m = m.isEven() ? m.multiply2().add(1) : m.multiply2().subtract(1);
      ++cnt;
    } while (!m.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
