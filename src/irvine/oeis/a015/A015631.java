package irvine.oeis.a015;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007438;

/**
 * A015631 Number of ordered triples of integers from [ 1..n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015631 extends PartialSumSequence {

  /** Construct the sequence. */
  public A015631() {
    super(1, new A007438());
  }
}
