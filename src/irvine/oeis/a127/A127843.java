package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127843 <code>a(1) = 1, a(2) = ... = a(9) = 0, a(n) = a(n-9)+a(n-8)</code> for <code>n&gt;9</code>.
 * @author Sean A. Irvine
 */
public class A127843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127843() {
    super(new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
