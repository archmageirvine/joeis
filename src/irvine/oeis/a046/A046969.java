package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A046969 Denominators of coefficients in Stirling's expansion for log(Gamma(z)).
 * @author Sean A. Irvine
 */
public class A046969 extends A046968 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}

