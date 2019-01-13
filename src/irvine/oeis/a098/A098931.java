package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098931.
 * @author Sean A. Irvine
 */
public class A098931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098931() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 27, 69});
  }
}
