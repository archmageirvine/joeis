package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156844 279841n^2 - 394634n + 139128.
 * @author Sean A. Irvine
 */
public class A156844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156844() {
    super(new long[] {1, -3, 3}, new long[] {24335, 469224, 1473795});
  }
}
