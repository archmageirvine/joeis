package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041349 Denominators of continued fraction convergents to sqrt(188).
 * @author Sean A. Irvine
 */
public class A041349 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041349() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 9214, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 7, 45, 97, 239, 336, 8975, 9311, 27597, 64505, 414627, 893759, 2202145, 3095904});
  }
}
