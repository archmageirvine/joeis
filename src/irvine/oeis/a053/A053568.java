package irvine.oeis.a053;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a007.A007617;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A053568 Totients of nontotient numbers.
 * @author Georg Fischer
 */
public class A053568 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A053568() {
    super(1, (term, n) -> Functions.PHI.z(term), "", new A007617());
  }
}
