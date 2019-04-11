package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141577 Alternating difference recursion: <code>a(0) = -1</code>; <code>a(1) = 0</code>; <code>a(2) = 1</code>; <code>a(3) = -1</code>; <code>a(n) = a(n-1) - 3*a(n-2) + 3*a(n-3) - a(n-4)</code>.
 * @author Sean A. Irvine
 */
public class A141577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141577() {
    super(new long[] {-1, 3, -3, 1}, new long[] {-1, 0, 1, -1});
  }
}
