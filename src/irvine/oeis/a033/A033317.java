package irvine.oeis.a033;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A033317 Smallest positive integer y satisfying the Pell equation x^2 - D*y^2 = 1 for nonsquare D.
 * @author Sean A. Irvine
 */
public class A033317 extends A033313 {

  @Override
  protected Z select(final Q conv) {
    return conv.den();
  }
}

