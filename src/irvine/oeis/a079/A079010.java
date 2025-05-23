package irvine.oeis.a079;
// Generated by gen_seq4.pl 2024-11-10.ack/sintrif at 2024-11-10 23:25

import irvine.math.function.Functions;
import irvine.oeis.a022.A022008;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A079010 a(n) = nextprime(16 + A022008(n)) - (16 + A022008(n)).
 * @author Georg Fischer
 */
public class A079010 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A079010() {
    super(1, (term, n) -> Functions.NEXT_PRIME.z(term.add(16)).subtract(term.add(16)), "", new A022008());
  }
}
