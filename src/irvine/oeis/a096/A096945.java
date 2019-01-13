package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096945.
 * @author Sean A. Irvine
 */
public class A096945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096945() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {5, 36, 148, 456, 1170, 2640, 5412, 10296});
  }
}
