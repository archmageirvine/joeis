package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057675.
 * @author Sean A. Irvine
 */
public class A057675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057675() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 52, 192, 507});
  }
}
