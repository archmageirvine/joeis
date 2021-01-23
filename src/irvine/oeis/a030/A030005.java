package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030005 (prime(n)-1)(prime(n)-3)/8.
 * @author Sean A. Irvine
 */
public class A030005 extends A000040 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(1)
      .multiply(p.subtract(3))
      .divide(8);
  }
}
