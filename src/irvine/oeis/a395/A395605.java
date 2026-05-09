package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A395605 allocated for Simone Cammarasana.
 * @author Sean A. Irvine
 */
public class A395605 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.LUCAS.z(p).subtract(1).divide(p).mod(p);
  }
}
