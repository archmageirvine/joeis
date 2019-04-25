package irvine.oeis.a067;

import irvine.oeis.LinearRecurrence;

/**
 * A067534 <code>a(n) = 4^n * sum_{i=1,n} i^4/4^i</code>.
 * @author Sean A. Irvine
 */
public class A067534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A067534() {
    super(new long[] {-4, 21, -45, 50, -30, 9}, new long[] {1, 20, 161, 900, 4225, 18196});
  }
}
