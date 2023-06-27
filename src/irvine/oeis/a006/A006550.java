package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006550 n+8*C(n,2)+30*C(n,3)+62*C(n,4)+75*C(n,5)+30*C(n,6).
 * @author Sean A. Irvine
 */
public class A006550 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006550() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 1, 10, 57, 234, 770, 2136});
  }
}

