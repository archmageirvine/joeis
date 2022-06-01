package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155657 10^n+7^n-1.
 * @author Sean A. Irvine
 */
public class A155657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155657() {
    super(new long[] {70, -87, 18}, new long[] {1, 16, 148});
  }
}
