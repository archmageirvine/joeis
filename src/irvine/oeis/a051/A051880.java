package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051880 <code>a(n) = binomial(n+4,4)*(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A051880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051880() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 15, 75, 245, 630, 1386});
  }
}
