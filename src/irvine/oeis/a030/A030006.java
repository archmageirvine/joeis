package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030006 a(n) = (prime(n)-1)*(prime(n)-5)/12.
 * @author Sean A. Irvine
 */
public class A030006 extends A000040 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(1)
      .multiply(p.subtract(5))
      .divide(12);
  }
}
