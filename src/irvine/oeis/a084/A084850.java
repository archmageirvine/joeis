package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084850 <code>2^(n-1)*(n^2+2n+2)</code>.
 * @author Sean A. Irvine
 */
public class A084850 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084850() {
    super(new long[] {8, -12, 6}, new long[] {1, 5, 20});
  }
}
