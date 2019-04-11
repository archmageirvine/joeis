package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072172 <code>a(n) = (2*n+1)*5^(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A072172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072172() {
    super(new long[] {-625, 50}, new long[] {5, 375});
  }
}
