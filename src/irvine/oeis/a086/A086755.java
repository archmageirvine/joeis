package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086755 Sum_{k=1..n} <code>k(k+1)^2/2</code>.
 * @author Sean A. Irvine
 */
public class A086755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086755() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 20, 92, 292, 742, 1624});
  }
}
