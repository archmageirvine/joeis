package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A028921 Determinant of n-dimensional laminated lattice <code>Lambda(n)</code> (non-integral beyond the entries shown).
 * @author Sean A. Irvine
 */
public class A028921 extends FiniteSequence {

  /** Construct the sequence. */
  public A028921() {
    super(1, 4, 12, 32, 64, 128, 192, 256, 256, 512, 768, 1024, 1024, 1024, 768, 512, 256, 256, 192, 128, 64, 32, 12, 4, 1, 2, 3, 4, 4, 4, 3, 2, 1, 1);
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
