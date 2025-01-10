package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A074073 Denominators of iterations of Thue-Morse sequence.
 * @author Sean A. Irvine
 */
public class A074073 extends A074072 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
