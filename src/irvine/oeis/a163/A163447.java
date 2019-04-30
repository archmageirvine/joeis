package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163447 <code>a(n) = 18*a(n-1) - 79*a(n-2)</code> for <code>n &gt; 1; a(0) = 1, a(1) = 11</code>.
 * @author Sean A. Irvine
 */
public class A163447 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163447() {
    super(new long[] {-79, 18}, new long[] {1, 11});
  }
}
