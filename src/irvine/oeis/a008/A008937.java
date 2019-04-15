package irvine.oeis.a008;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000073;

/**
 * A008937 <code>a(n) =</code> Sum_{k=0..n} <code>T(k)</code> where <code>T(n)</code> are the tribonacci numbers A000073.
 * @author Sean A. Irvine
 */
public class A008937 extends PartialSumSequence {

  /** Construct the sequence. */
  public A008937() {
    super(new SkipSequence(new A000073(), 1));
  }
}
