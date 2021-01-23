package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141041 a(n) = ((3 + 2*sqrt(3))^n + (3 - 2*sqrt(3))^n)/2.
 * @author Sean A. Irvine
 */
public class A141041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141041() {
    super(new long[] {3, 6}, new long[] {1, 3});
  }
}
