package irvine.oeis.a099;
// Generated by gen_seq4.pl manch5/tuptraf at 2024-03-12 22:08

import irvine.math.function.Functions;
import irvine.oeis.a002.A002279;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A099659 a(n) is the least prime following A002279(n) repdigits.
 * @author Georg Fischer
 */
public class A099659 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A099659() {
    super(1, (n, s) -> Functions.NEXT_PRIME.z(s[0]), "", new A002279().skip(1));
  }
}
