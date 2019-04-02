package irvine.oeis.a015;

import irvine.oeis.PartialSumSequence;

/**
 * A015724 Number of parts in all partitions of all the numbers in {1,2,...,n} into distinct parts.
 * @author Sean A. Irvine
 */
public class A015724 extends PartialSumSequence {

  /** Construct the sequence. */
  public A015724() {
    super(new A015723());
  }
}
