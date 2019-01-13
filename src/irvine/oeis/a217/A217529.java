package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217529.
 * @author Sean A. Irvine
 */
public class A217529 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217529() {
    super(new long[] {8, -12, 6}, new long[] {23, 86, 284});
  }
}
