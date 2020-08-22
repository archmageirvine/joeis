package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A028922 Determinant of n-dimensional lattice Kappa(n) (non-integral beyond the entries shown).
 * @author Sean A. Irvine
 */
public class A028922 extends FiniteSequence {

  /** Construct the sequence. */
  public A028922() {
    super(1, 4, 12, 32, 64, 128, 192, 384, 576, 864, 972, 972, 729, 972, 972, 864, 576, 384, 192, 128, 64, 32, 12, 4, 1, 2, 3, 4, 4, 4, 3, 3);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (t == null) {
      throw new UnsupportedOperationException("Next term is not an integer");
    }
    return t;
  }
}
