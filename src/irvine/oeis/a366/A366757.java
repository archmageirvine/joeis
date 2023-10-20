package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a033.A033312;

/**
 * A366757.
 * @author Sean A. Irvine
 */
public class A366757 extends A033312 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
