package irvine.oeis.a069;
// Generated by gen_seq4.pl deris/partsum at 2022-10-26 15:17

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a061.A061142;

/**
 * A069205 a(n) = Sum_{k=1..n} 2^bigomega(k).
 * @author Georg Fischer
 */
public class A069205 extends PartialSumSequence {

  /** Construct the sequence. */
  public A069205() {
    super(1, new A061142());
  }
}
