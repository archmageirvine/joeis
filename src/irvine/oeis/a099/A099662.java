package irvine.oeis.a099;
// Generated by gen_seq4.pl 2023-11-17/tuptraf at 2023-11-17 22:41

import irvine.math.function.Functions;
import irvine.oeis.a002.A002282;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A099662 a(n) is the least prime following A002282(n) repdigits.
 * @author Georg Fischer
 */
public class A099662 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A099662() {
    super(0, (n, s) -> Functions.NEXT_PRIME.z(s[0]), "", new A002282());
  }
}
