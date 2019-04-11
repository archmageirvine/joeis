package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154597 <code>a(n) = 15*a(n-1) + a(n-2)</code> with <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A154597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154597() {
    super(new long[] {1, 15}, new long[] {0, 1});
  }
}
