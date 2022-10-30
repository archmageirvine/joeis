package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A030003 (prime(n)-3)(prime(n)-5)(prime(n)-7)/48.
 * @author Sean A. Irvine
 */
public class A030003 extends A065091 {

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(3)
      .multiply(p.subtract(5))
      .multiply(p.subtract(7))
      .divide(48);
  }
}
