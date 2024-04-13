package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A004150 Euler numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004150 extends A000111 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}
