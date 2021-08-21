package irvine.oeis.a050;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a034.A034706;

/**
 * A050941 Numbers that are not the sum of consecutive triangular numbers.
 * @author Sean A. Irvine
 */
public class A050941 extends ComplementSequence {

  /** Construct the sequence. */
  public A050941() {
    super(new A034706());
  }
}
