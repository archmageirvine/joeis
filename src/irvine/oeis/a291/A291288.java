package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291288 <code>a(n) = binomial(n+3, 3)*(1 + binomial(n+2, 3)/4)</code>.
 * @author Sean A. Irvine
 */
public class A291288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291288() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 5, 20, 70, 210, 546, 1260});
  }
}
