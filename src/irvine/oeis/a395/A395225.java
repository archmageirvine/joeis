package irvine.oeis.a395;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A395225 allocated for Dimitris Valianatos.
 * @author Sean A. Irvine
 */
public class A395225 extends A395224 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
