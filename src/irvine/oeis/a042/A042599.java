package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042599 Denominators of continued fraction convergents to <code>sqrt(828)</code>.
 * @author Sean A. Irvine
 */
public class A042599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042599() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 2302, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 9, 31, 40, 2271, 2311, 9204, 20719, 71361, 92080});
  }
}
