package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A030007 a(n) = (prime(n)-3)*(prime(n)-5)/8.
 * @author Sean A. Irvine
 */
public class A030007 extends A065091 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(3)
      .multiply(p.subtract(5))
      .divide(8);
  }
}
