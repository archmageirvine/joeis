package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097741 Pell equation solutions <code>(10*a(n))^2 -</code> 101*b(n)^2 <code>= -1</code> with b(n) = A097742(n), <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A097741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097741() {
    super(new long[] {-1, 402}, new long[] {1, 403});
  }
}
