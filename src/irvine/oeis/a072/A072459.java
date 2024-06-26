package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a005.A005277;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A072459 Largest prime divisor of even nontotients.
 * @author Georg Fischer
 */
public class A072459 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A072459() {
    super(1, (term, n) -> Functions.GPF.z(term), "", new A005277());
  }
}
