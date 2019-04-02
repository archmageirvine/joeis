package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057675 1 - (5/6)*n + (5/2)*n^2 + (10/3)*n^3 + n^4.
 * @author Sean A. Irvine
 */
public class A057675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057675() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 52, 192, 507});
  }
}
