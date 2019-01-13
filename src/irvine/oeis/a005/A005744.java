package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005744.
 * @author Sean A. Irvine
 */
public class A005744 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005744() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 1, 4, 9, 17});
  }
}

