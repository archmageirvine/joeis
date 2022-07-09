package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158410 a(n) = 961*n^2 - 2*n.
 * @author Sean A. Irvine
 */
public class A158410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158410() {
    super(new long[] {1, -3, 3}, new long[] {959, 3840, 8643});
  }
}
