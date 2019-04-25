package irvine.oeis.a269;

import irvine.oeis.LinearRecurrence;

/**
 * A269445 <code>a(n) = Sum_{k=0..n} floor(k/13)</code>.
 * @author Sean A. Irvine
 */
public class A269445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269445() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2});
  }
}
