package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155638 a(n) = 11^n+5^n-1^n.
 * @author Sean A. Irvine
 */
public class A155638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155638() {
    super(new long[] {55, -71, 17}, new long[] {1, 15, 145});
  }
}
