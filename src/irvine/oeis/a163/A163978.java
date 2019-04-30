package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163978 <code>a(n) = 2*a(n-2)</code> for <code>n &gt; 2; a(1) = 3, a(2) = 4</code>.
 * @author Sean A. Irvine
 */
public class A163978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163978() {
    super(new long[] {2, 0}, new long[] {3, 4});
  }
}
