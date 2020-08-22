package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288836 a(n) = (1/3!)*3^(n+1)*(n+5)*(n+1)*(n).
 * @author Sean A. Irvine
 */
public class A288836 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288836() {
    super(new long[] {-81, 108, -54, 12}, new long[] {18, 189, 1296, 7290});
  }
}
