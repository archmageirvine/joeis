package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216073 The list of the a(n)-values in the common solutions to  k+1=b^2 and 6*k+1=a^2.
 * @author Sean A. Irvine
 */
public class A216073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216073() {
    super(new long[] {-1, 0, 10, 0}, new long[] {1, 7, 17, 71});
  }
}
