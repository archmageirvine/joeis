package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028045 Expansion of <code>1/((1-3x)(1-4x)(1-8x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A028045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028045() {
    super(new long[] {-1056, 844, -233, 26}, new long[] {1, 26, 443, 6304});
  }
}
