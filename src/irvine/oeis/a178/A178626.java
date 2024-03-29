package irvine.oeis.a178;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A178626 Convolution of Pell(n) and 10^n.
 * @author Sean A. Irvine
 */
public class A178626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178626() {
    super(1, new long[] {-10, -19, 12}, new long[] {1, 12, 125});
  }
}
