package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134035.
 * @author Sean A. Irvine
 */
public class A134035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134035() {
    super(new long[] {-3, 3, 8, -8, -6, 6, 1}, new long[] {2, 4, 8, 13, 21, 39, 64});
  }
}
