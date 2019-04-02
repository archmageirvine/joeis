package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168230 a(n) = n + 2 - a(n-1) for n&gt;1; a(1) = 0.
 * @author Sean A. Irvine
 */
public class A168230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168230() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 1});
  }
}
