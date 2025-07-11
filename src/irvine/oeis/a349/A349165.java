package irvine.oeis.a349;
// Generated by gen_seq4.pl 2025-06-15.ack/filtpos at 2025-06-15 21:33

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a342.A342671;

/**
 * A349165 Numbers k such that sigma(k) and A003961(k) are relatively prime, where A003961(n) is fully multiplicative function with a(prime(k)) = prime(k+1).
 * @author Georg Fischer
 */
public class A349165 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A349165() {
    super(1, 1, new A342671(), ONE);
  }
}
