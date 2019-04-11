package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027620 <code>a(n) = n + (n+1)^2 + (n+2)^3</code>.
 * @author Sean A. Irvine
 */
public class A027620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027620() {
    super(new long[] {-1, 4, -6, 4}, new long[] {9, 32, 75, 144});
  }
}
