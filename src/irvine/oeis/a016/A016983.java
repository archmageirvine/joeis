package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016983 a(n) = (7*n)^3.
 * @author Sean A. Irvine
 */
public class A016983 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016983() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 343, 2744, 9261});
  }
}
