package irvine.oeis.a011;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000301;

/**
 * A011455 Sum 2^Fibonacci(i), i=2..n.
 * @author Sean A. Irvine
 */
public class A011455 extends PartialSumSequence {

  /** Construct the sequence. */
  public A011455() {
    super(2, new SkipSequence(new A000301(), 2));
  }
}
