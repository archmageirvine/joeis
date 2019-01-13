package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262062.
 * @author Sean A. Irvine
 */
public class A262062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262062() {
    super(new long[] {1, -27, 27}, new long[] {85, 2269, 58969});
  }
}
