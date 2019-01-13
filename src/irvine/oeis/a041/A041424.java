package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041424.
 * @author Sean A. Irvine
 */
public class A041424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041424() {
    super(new long[] {-1, 0, 302, 0}, new long[] {15, 151, 4545, 45601});
  }
}
