package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041881.
 * @author Sean A. Irvine
 */
public class A041881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041881() {
    super(new long[] {-1, 0, 86, 0}, new long[] {1, 2, 85, 172});
  }
}
