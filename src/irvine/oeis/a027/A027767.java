package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027767 <code>a(n) =</code> (n+1)*binomial(n+1,7).
 * @author Sean A. Irvine
 */
public class A027767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027767() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {7, 64, 324, 1200, 3630, 9504, 22308, 48048, 96525});
  }
}
