package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054417 Number of connected <code>3 X n</code> binary matrices with rightmost column <code>[1,0,0]'</code>.
 * @author Sean A. Irvine
 */
public class A054417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054417() {
    super(new long[] {5, -3, 7}, new long[] {1, 5, 37});
  }
}
