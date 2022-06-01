package irvine.oeis.a292;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A292185 One-fifth of the rolling arithmetic mean of the fifth powers of the natural numbers taken five at a time.
 * @author Sean A. Irvine
 */
public class A292185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292185() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {177, 488, 1159, 2460, 4781, 8656});
  }
}
