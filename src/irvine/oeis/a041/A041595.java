package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041595.
 * @author Sean A. Irvine
 */
public class A041595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041595() {
    super(new long[] {-1, 0, 0, 0, 142, 0, 0, 0}, new long[] {1, 1, 3, 4, 139, 143, 425, 568});
  }
}
