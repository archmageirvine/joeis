package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154595 Period 6: repeat [1, 3, 3, -1, -3, -3].
 * @author Sean A. Irvine
 */
public class A154595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154595() {
    super(new long[] {-1, 0, 0}, new long[] {1, 3, 3});
  }
}
