package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047238.
 * @author Sean A. Irvine
 */
public class A047238 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047238() {
    super(new long[] {-1, 1, 1}, new long[] {0, 2, 6});
  }
}
