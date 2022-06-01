package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016827 a(n) = (4n+2)^3.
 * @author Sean A. Irvine
 */
public class A016827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016827() {
    super(new long[] {-1, 4, -6, 4}, new long[] {8, 216, 1000, 2744});
  }
}
