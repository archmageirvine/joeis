package irvine.oeis.a122;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A122652 a(0) = 0, a(1) = 4; for n &gt; 1, a(n) = 10*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A122652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122652() {
    super(new long[] {-1, 10}, new long[] {0, 4});
  }
}
