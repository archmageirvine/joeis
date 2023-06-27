package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131515 a(n+2) = 34*a(n+1) - a(n) + 2; a(1) = 1 and a(2) = 16.
 * @author Sean A. Irvine
 */
public class A131515 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131515() {
    super(1, new long[] {1, -35, 35}, new long[] {1, 16, 545});
  }
}
