package irvine.oeis.a051;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a048.A048967;

/**
 * A051679 Total number of even entries in first n rows of Pascal's triangle (the zeroth and first rows being 1; 1,1).
 * @author Sean A. Irvine
 */
public class A051679 extends PartialSumSequence {

  /** Construct the sequence. */
  public A051679() {
    super(new A048967());
  }
}
