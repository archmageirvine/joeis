package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180675.
 * @author Sean A. Irvine
 */
public class A180675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180675() {
    super(new long[] {1, -3, 11}, new long[] {1, 1, 1});
  }
}
