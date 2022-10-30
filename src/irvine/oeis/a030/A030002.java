package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030002 (prime(n)-5)(prime(n)-7)(prime(n)-9)/48.
 * @author Sean A. Irvine
 */
public class A030002 extends A000040 {

  {
    setOffset(3);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.subtract(5)
      .multiply(p.subtract(7))
      .multiply(p.subtract(9))
      .divide(48);
  }
}
