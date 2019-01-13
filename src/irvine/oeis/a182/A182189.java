package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182189.
 * @author Sean A. Irvine
 */
public class A182189 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182189() {
    super(new long[] {1, -7, 7}, new long[] {1, 3, 13});
  }
}
