package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a054.A054055;

/**
 * A030076 a(n) = 10 - m, where m = maximal digit of n.
 * @author Sean A. Irvine
 */
public class A030076 extends A054055 {

  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    return Z.TEN.subtract(super.next());
  }
}
