package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244842 <code>a(n) = (10^n - 1)*(10^n - 10)/90</code>.
 * @author Sean A. Irvine
 */
public class A244842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244842() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 99, 10989});
  }
}
