package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269025 <code>a(n) =</code> Sum_{k <code>= 0..n} 60^k</code>.
 * @author Sean A. Irvine
 */
public class A269025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269025() {
    super(new long[] {-60, 61}, new long[] {1, 61});
  }
}
