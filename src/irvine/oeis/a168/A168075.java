package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168075.
 * @author Sean A. Irvine
 */
public class A168075 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168075() {
    super(new long[] {-81, -27, 0, -3}, new long[] {1, -3, 36, -189});
  }
}
