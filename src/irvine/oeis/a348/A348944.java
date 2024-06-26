package irvine.oeis.a348;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a003.A003959;
import irvine.oeis.a034.A034448;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A348944 a(n) = (1/2) * (A003959(n)+A034448(n)), where A003959 is multiplicative with a(p^e) = (p+1)^e and A034448 (usigma) is multiplicative with a(p^e) = (p^e)+1.
 * @author Georg Fischer
 */
public class A348944 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A348944() {
    super(1, (n, s) -> s[0].add(s[1]).divide(2), "", new A003959(), new A034448());
  }
}
