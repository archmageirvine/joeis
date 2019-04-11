package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139757 <code>a(n) = (n+1)*(2n+1)^2</code>.
 * @author Sean A. Irvine
 */
public class A139757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139757() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 18, 75, 196});
  }
}
