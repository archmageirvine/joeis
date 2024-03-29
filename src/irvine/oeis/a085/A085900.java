package irvine.oeis.a085;
// Generated by gen_seq4.pl 2023-09-07/filtpos at 2023-09-07 22:53

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a086.A086780;

/**
 * A085900 Numbers k such that k-th cyclotomic polynomial has exactly 3 negative coefficients.
 * @author Georg Fischer
 */
public class A085900 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A085900() {
    super(0, 1, new A086780(), t -> t.equals(Z.THREE));
  }
}
