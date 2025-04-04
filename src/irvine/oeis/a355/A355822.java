package irvine.oeis.a355;
// Generated by gen_seq4.pl 2025-03-07.ack/complem at 2025-03-07 21:14

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A355822 Numbers k such that A003961(k) and A276086(k) share a prime factor, where A003961 is fully multiplicative with a(p) = nextprime(p), and A276086 is primorial base exp-function.
 * @author Georg Fischer
 */
public class A355822 extends ComplementSequence {

  /** Construct the sequence. */
  public A355822() {
    super(1, new A355821(), Z.ONE);
  }
}
