package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163888 a(n) = 2*a(n-2) for n &gt; 2; a(1) = 5, a(2) = 4.
 * @author Sean A. Irvine
 */
public class A163888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163888() {
    super(new long[] {2, 0}, new long[] {5, 4});
  }
}
