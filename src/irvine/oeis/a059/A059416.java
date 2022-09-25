package irvine.oeis.a059;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A059416 Denominators of sequence arising from Apery's proof that zeta(3) is irrational.
 * @author Sean A. Irvine
 */
public class A059416 extends A059415 {

  @Override
  protected Z select(final Q n) {
    return n.den();
  }
}
