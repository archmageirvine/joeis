package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A399071.
 * @author Sean A. Irvine
 */
public class A087094 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.compareTo(Z.FIVE) <= 0) {
      return p.equals(Z.THREE) ? Z.NINE : Z.ZERO;
    }
    return Functions.ORDER.z(p.square(), Z.TEN);
  }
}
