package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098923.
 * @author Sean A. Irvine
 */
public class A098923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098923() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 33});
  }
}
