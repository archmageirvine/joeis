package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163888 <code>a(n) = 2*a(n-2)</code> for <code>n &gt; 2; a(1) = 5, a(2) = 4</code>.
 * @author Sean A. Irvine
 */
public class A163888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163888() {
    super(new long[] {2, 0}, new long[] {5, 4});
  }
}
