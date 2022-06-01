package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016791 a(n) = (3*n + 2)^3.
 * @author Sean A. Irvine
 */
public class A016791 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016791() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 125, 512, 1331});
  }
}
