package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A053519 Denominators of successive convergents to continued fraction 1+2/(3+3/(4+4/(5+5/(6+6/(7+7/(8+8/(9+9/10+...))))))).
 * @author Sean A. Irvine
 */
public class A053519 extends A053518 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
