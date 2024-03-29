package irvine.oeis.a135;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a239.A239885;

/**
 * A135483 a(n) = Sum_{j=1..n} prime(j)*2^(j-2).
 * @author Sean A. Irvine
 */
public class A135483 extends PartialSumSequence {

  /** Construct the sequence. */
  public A135483() {
    super(1, new A239885());
  }
}
