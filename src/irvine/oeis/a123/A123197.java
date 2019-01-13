package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123197.
 * @author Sean A. Irvine
 */
public class A123197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123197() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {-1, 24, 195, 728, 1935});
  }
}
