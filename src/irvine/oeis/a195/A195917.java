package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195917.
 * @author Sean A. Irvine
 */
public class A195917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195917() {
    super(new long[] {1, -1, -254, 254, 1}, new long[] {0, 24, 120, 6240, 30624});
  }
}
