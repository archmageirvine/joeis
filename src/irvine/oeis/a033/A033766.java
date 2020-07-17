package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a138.A138613;

/**
 * A033766.
 * @author Sean A. Irvine
 */
public class A033766 extends A138613 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).omega());
  }
}
