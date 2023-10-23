package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000073;

/**
 * A366769.
 * @author Sean A. Irvine
 */
public class A366782 extends A000073 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma0();
  }
}
