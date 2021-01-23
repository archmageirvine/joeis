package irvine.oeis.a096;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a013.A013517;

/**
 * A096671 Denominators of terms in series expansion of sin(tan(x)), odd powers only.
 * @author Sean A. Irvine
 */
public class A096671 extends A013517 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
