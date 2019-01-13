package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047278.
 * @author Sean A. Irvine
 */
public class A047278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047278() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 6, 8});
  }
}
