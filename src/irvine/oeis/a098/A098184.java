package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098184.
 * @author Sean A. Irvine
 */
public class A098184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098184() {
    super(new long[] {1, 1, 3}, new long[] {1, 1, 5});
  }
}
