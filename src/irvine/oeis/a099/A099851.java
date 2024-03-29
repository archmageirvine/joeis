package irvine.oeis.a099;
// Generated by gen_seq4.pl filtpos at 2023-09-08 10:19

import irvine.oeis.FilterPositionSequence;

/**
 * A099851 Numbers k such that A099850(k) is divisible by k.
 * @author Georg Fischer
 */
public class A099851 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A099851() {
    super(1, 1, new A099850(), DIVISIBLE_BY_INDEX);
  }
}
