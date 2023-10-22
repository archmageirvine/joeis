package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001045;

/**
 * A366769.
 * @author Sean A. Irvine
 */
public class A366771 extends A001045 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
