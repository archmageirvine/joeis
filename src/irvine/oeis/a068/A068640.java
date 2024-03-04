package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068640 Define f(n) = 2n+1, a(n) = largest prime of the form f(f(f(...(n))). If no such prime exists then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A068640 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z res = Z.ZERO;
    Z s = Z.valueOf(++mN);
    while ((s = s.multiply2().add(1)).isProbablePrime()) {
      res = s;
    }
    return res;
  }
}
