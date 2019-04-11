package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164605 <code>a(n) = ((1+4*sqrt(2))*(4+2*sqrt(2))^n + (1-4*sqrt(2))*(4-2*sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A164605 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164605() {
    super(new long[] {-8, 8}, new long[] {1, 20});
  }
}
