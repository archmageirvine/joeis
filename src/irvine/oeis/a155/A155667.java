package irvine.oeis.a155;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A155667 a(n) = 10^n-8^n+1.
 * @author Sean A. Irvine
 */
public class A155667 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155667() {
    super(new long[] {80, -98, 19}, new long[] {1, 3, 37});
  }
}
