package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016756 a(n) = (2*n+1)^4.
 * @author Sean A. Irvine
 */
public class A016756 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016756() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 81, 625, 2401, 6561});
  }
}
