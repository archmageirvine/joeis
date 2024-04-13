package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000292;

/**
 * A004161 Tetrahedral numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004161 extends A000292 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}
