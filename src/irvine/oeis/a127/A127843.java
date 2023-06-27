package irvine.oeis.a127;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A127843 a(1) = 1, a(2) = ... = a(9) = 0, a(n) = a(n-9)+a(n-8) for n&gt;9.
 * @author Sean A. Irvine
 */
public class A127843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127843() {
    super(1, new long[] {1, 1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
