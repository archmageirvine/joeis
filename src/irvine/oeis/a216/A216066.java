package irvine.oeis.a216;
// Generated by gen_seq4.pl 2025-02-13.ack/prepend at 2025-02-13 23:28

import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003558;

/**
 * A216066 a(n) = card {cos((2^k)*Pi/(2*n-1)): k in N}.
 * @author Georg Fischer
 */
public class A216066 extends PrependSequence {

  /** Construct the sequence. */
  public A216066() {
    super(1, new A003558().skip(1), 1);
  }
}
