package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a038.A038507;

/**
 * A366757.
 * @author Sean A. Irvine
 */
public class A366760 extends A038507 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}
