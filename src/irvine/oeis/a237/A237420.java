package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237420 If n is odd, then <code>a(n) = 0</code>; otherwise, <code>a(n) =</code> n.
 * @author Sean A. Irvine
 */
public class A237420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237420() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 0, 2, 0});
  }
}
