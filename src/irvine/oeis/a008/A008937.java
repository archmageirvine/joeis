package irvine.oeis.a008;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000073;

/**
 * A008937 a(n) = Sum_{k=0..n} T(k) where T(n) are the tribonacci numbers A000073.
 * @author Sean A. Irvine
 */
public class A008937 extends PartialSumSequence {

  /** Construct the sequence. */
  public A008937() {
    super(new A000073().skip(1));
  }
}
