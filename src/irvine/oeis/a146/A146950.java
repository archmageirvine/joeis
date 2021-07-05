package irvine.oeis.a146;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.Subsequence;
import irvine.oeis.a061.A061047;

/**
 * A146950 Terms of A061047 ending in 0.
 * @author Georg Fischer
 */
public class A146950 extends Subsequence {

  /** Construct the sequence */
  public A146950() {
    super(new A061047());
  }

  @Override
  public boolean isOk(final Z term) {
    return term.mod(Z.TEN).isZero();
  }
}
