package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111352 <code>a(n+3) = a(n+2) + 3*a(n+1) + a(n)</code>.
 * @author Sean A. Irvine
 */
public class A111352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111352() {
    super(new long[] {1, 3, 1}, new long[] {1, -1, 2});
  }
}
