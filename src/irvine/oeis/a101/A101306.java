package irvine.oeis.a101;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007652;

/**
 * A101306 a(n) = Sum_{i=1..n} {last digit of prime(i)}.
 * @author Sean A. Irvine
 */
public class A101306 extends PartialSumSequence {

  /** Construct the sequence. */
  public A101306() {
    super(1, new A007652());
  }
}
