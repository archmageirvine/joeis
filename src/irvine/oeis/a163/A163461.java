package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163461 <code>a(n) = 18*a(n-1) - 79*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 10</code>.
 * @author Sean A. Irvine
 */
public class A163461 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163461() {
    super(new long[] {-79, 18}, new long[] {1, 10});
  }
}
