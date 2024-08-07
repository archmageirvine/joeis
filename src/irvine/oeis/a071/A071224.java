package irvine.oeis.a071;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a002.A002808;
import irvine.oeis.a064.A064814;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A071224 LCM of n and n-th composite number.
 * @author Georg Fischer
 */
public class A071224 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A071224() {
    super(1, (n, s) -> s[0].multiply(n).divide(s[1]), "", new A002808(), new A064814());
  }
}
