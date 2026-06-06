package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085198 Function whose restriction to A014486 gives A071156.
 * @author Sean A. Irvine
 */
public class A085198 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    Z s = Z.ZERO;
    long h = 1;
    long i = 2;
    Z fi = Z.ONE;
    while (!m.isZero()) {
      if (m.isOdd()) {
        m = m.subtract(1).divide2();
        --h;
      } else {
        m = m.divide2();
        s = s.add(fi.multiply(h));
        ++h;
        fi = fi.multiply(i++);
      }
    }
    return s;
  }
}
