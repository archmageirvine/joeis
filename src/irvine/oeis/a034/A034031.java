package irvine.oeis.a034;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a057.A057127;

/**
 * A034031 Numbers that are primitively but not imprimitively represented by <code>x^2+2y^2</code>.
 * @author Sean A. Irvine
 */
public class A034031 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A034031() {
    super(new A057127(), new A034030());
  }
}
