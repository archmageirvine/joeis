package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056117 Expansion of <code>(1+8*x)/(1-x)^9</code>.
 * @author Sean A. Irvine
 */
public class A056117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056117() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 17, 117, 525, 1815, 5247, 13299, 30459, 64350});
  }
}
