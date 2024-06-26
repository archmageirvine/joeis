package irvine.oeis.a109;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.math.q.Q;
import irvine.oeis.a007.A007947;
import irvine.oeis.a173.A173557;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A109395 Denominator of phi(n)/n = Product_{p|n} (1 - 1/p); phi(n)=A000010(n), the Euler totient function.
 * @author Georg Fischer
 */
public class A109395 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A109395() {
    super(1, (n, s) -> new Q(s[0], s[1]).den(), "", new A173557(), new A007947());
  }
}
