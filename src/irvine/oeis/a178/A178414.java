package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178414.
 * @author Sean A. Irvine
 */
public class A178414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178414() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 3, 9, 7});
  }
}
