package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134176.
 * @author Sean A. Irvine
 */
public class A134176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134176() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 9, 144, 765});
  }
}
