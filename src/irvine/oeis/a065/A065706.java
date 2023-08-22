package irvine.oeis.a065;
// manually robots/union2 at 2023-08-18 21:53

import irvine.oeis.UnionSequence;
import irvine.oeis.a022.A022011;
import irvine.oeis.a022.A022012;
import irvine.oeis.a022.A022013;

/**
 * A065706 Least member p1 of prime octuplets (p1, p2, p3, ..., p8 = p1 + 26), the eight p's being consecutive primes.
 * @author Georg Fischer
 */
public class A065706 extends UnionSequence {

  /** Construct the sequence. */
  public A065706() {
    super(1, new A022011(), new A022012(), new A022013());
  }
}
