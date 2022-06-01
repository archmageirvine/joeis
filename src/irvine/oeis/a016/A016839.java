package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016839 a(n) = (4*n+3)^3.
 * @author Sean A. Irvine
 */
public class A016839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016839() {
    super(new long[] {-1, 4, -6, 4}, new long[] {27, 343, 1331, 3375});
  }
}
