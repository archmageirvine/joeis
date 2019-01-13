package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098533.
 * @author Sean A. Irvine
 */
public class A098533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098533() {
    super(new long[] {1, 20, -294, -819, 2912, -728, -1365, 252, 22}, new long[] {0, 1, 2, 130, 2317, 80442, 2177594, 64926111, 1866014652});
  }
}
