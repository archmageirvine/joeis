package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162436 <code>a(n) = 3*a(n-2)</code> for <code>n &gt; 2</code>; <code>a(1) = 1, a(2) = 3</code>.
 * @author Sean A. Irvine
 */
public class A162436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162436() {
    super(new long[] {3, 0}, new long[] {1, 3});
  }
}
