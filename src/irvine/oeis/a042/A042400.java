package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042400 Numerators of continued fraction convergents to <code>sqrt(727)</code>.
 * @author Sean A. Irvine
 */
public class A042400 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042400() {
    super(new long[] {-1, 0, 0, 0, 1456, 0, 0, 0}, new long[] {26, 27, 701, 728, 38557, 39285, 1020682, 1059967});
  }
}
