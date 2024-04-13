package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000326;

/**
 * A004163 Pentagonal numbers written backwards.
 * @author Sean A. Irvine
 */
public class A004163 extends A000326 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}
