package irvine.oeis.a367;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002064;

/**
 * A366899.
 * @author Sean A. Irvine
 */
public class A367009 extends A002064 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
