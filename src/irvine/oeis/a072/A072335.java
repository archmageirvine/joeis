package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072335.
 * @author Sean A. Irvine
 */
public class A072335 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072335() {
    super(new long[] {1, -4, 0, 4}, new long[] {1, 4, 16, 60});
  }
}
