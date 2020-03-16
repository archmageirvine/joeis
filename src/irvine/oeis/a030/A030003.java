package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030003 <code>(prime(n)-3)(prime(n)-5)(prime(n)-7)/48</code>.
 * @author Sean A. Irvine
 */
public class A030003 extends A000040 {

  {
    super.next();
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
