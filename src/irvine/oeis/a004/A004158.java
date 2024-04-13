package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A004158 Triangular numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004158 extends A000217 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}
