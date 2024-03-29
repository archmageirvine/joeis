package irvine.oeis.a071;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a067.A067342;

/**
 * A071422 a(n) = a(n-1) + sum of decimal digits of sigma(n), the sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A071422 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071422() {
    super(1, new A067342());
  }
}
