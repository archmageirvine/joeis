package irvine.oeis.a132;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A132769 a(n) = n*(n + 27).
 * @author Sean A. Irvine
 */
public class A132769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132769() {
    super(new long[] {1, -3, 3}, new long[] {0, 28, 58});
  }
}
