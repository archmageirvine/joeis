package irvine.oeis.a015;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a007.A007438;

/**
 * A015631 Number of ordered triples of integers from <code>[ 1..n ]</code> with no global factor.
 * @author Sean A. Irvine
 */
public class A015631 extends PartialSumSequence {

  /** Construct the sequence. */
  public A015631() {
    super(new A007438());
  }
}
