package irvine.oeis.a138;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001690;

/**
 * A138105 Partial sums of non-Fibonacci numbers A001690.
 * @author Sean A. Irvine
 */
public class A138105 extends PartialSumSequence {

  /** Construct the sequence. */
  public A138105() {
    super(1, new A001690());
  }
}
