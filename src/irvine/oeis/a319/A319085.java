package irvine.oeis.a319;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a034.A034714;

/**
 * A319085 a(n) = Sum_{k=1..n} k^2*tau(k), where tau is A000005.
 * @author Sean A. Irvine
 */
public class A319085 extends PartialSumSequence {

  /** Construct the sequence. */
  public A319085() {
    super(1, new A034714());
  }
}
