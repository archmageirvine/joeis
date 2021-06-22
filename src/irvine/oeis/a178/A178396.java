package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178396 a(1)=1, a(n) = a(n-1)*1000 + 11^(n-1) for n&gt;=2.
 * @author Sean A. Irvine
 */
public class A178396 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178396() {
    super(new long[] {-11000, 1011}, new long[] {1, 1011});
  }
}
