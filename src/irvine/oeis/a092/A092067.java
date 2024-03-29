package irvine.oeis.a092;
// Generated by gen_seq4.pl 2023-12-24/simtraf at 2023-12-26 12:51

import irvine.oeis.a020.A020639;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A092067 a(n) is the smallest number m such that m &gt; 1 and m divides n^m + 1.
 * @author Georg Fischer
 */
public class A092067 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A092067() {
    super(1, new A020639().skip(1), v -> v);
  }
}
