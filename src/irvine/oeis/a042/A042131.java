package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042131 Denominators of continued fraction convergents to <code>sqrt(590)</code>.
 * @author Sean A. Irvine
 */
public class A042131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042131() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 11562, 0, 0, 0, 0, 0}, new long[] {1, 3, 7, 31, 69, 238, 11493, 34717, 80927, 358425, 797777, 2751756});
  }
}
