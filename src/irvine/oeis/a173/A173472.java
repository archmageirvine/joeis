package irvine.oeis.a173;
// Generated by gen_seq4.pl 2025-02-13.ack/prepend at 2025-02-13 23:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a137.A137291;

/**
 * A173472 Numbers k such that exactly one of prime(k)^2 - 2 and prime(k)^2 + 2 is prime.
 * @author Georg Fischer
 */
public class A173472 extends PrependSequence {

  /** Construct the sequence. */
  public A173472() {
    super(1, new A137291().skip(2), 1);
  }
}
