package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a038.A038507;

/**
 * A366757.
 * @author Sean A. Irvine
 */
public class A366758 extends A038507 {

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).sigma();
  }
}
