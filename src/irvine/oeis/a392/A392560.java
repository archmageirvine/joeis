package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a006.A006472;

/**
 * A392560 allocated for Diego Artacho.
 * @author Sean A. Irvine
 */
public class A392560 extends A006472 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z prod = super.next();
    return Functions.NEXT_PRIME.z(prod.add(1)).subtract(prod);
  }
}
