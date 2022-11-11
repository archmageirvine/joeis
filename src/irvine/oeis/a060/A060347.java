package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A060347 Denominators of sequence arising from study of Calabi-Yau manifolds.
 * @author Sean A. Irvine
 */
public class A060347 extends A060346 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
