package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041697 Denominators of continued fraction convergents to sqrt(368).
 * @author Sean A. Irvine
 */
public class A041697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041697() {
    super(new long[] {-1, 0, 0, 0, 2302, 0, 0, 0}, new long[] {1, 5, 11, 60, 2291, 11515, 25321, 138120});
  }
}
