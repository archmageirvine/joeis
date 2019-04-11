package irvine.oeis.a013;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a001.A001221;

/**
 * A013939 Partial sums of sequence A001221 (number of distinct primes dividing <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A013939 extends PartialSumSequence {

  /** Construct the sequence. */
  public A013939() {
    super(new A001221());
  }
}
