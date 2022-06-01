package irvine.oeis.a077;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A077957 Powers of 2 alternating with zeros.
 * @author Sean A. Irvine
 */
public class A077957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077957() {
    super(new long[] {2, 0}, new long[] {1, 0});
  }
}
