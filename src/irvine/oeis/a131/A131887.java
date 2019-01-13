package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131887.
 * @author Sean A. Irvine
 */
public class A131887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131887() {
    super(new long[] {-1, 0, 4, 0}, new long[] {3, 5, 11, 19});
  }
}
