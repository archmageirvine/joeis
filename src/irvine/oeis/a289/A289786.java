package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289786 p-INVERT of the odd positive integers (A005408), where p(S) <code>= 1 -</code> S - S^2.
 * @author Sean A. Irvine
 */
public class A289786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289786() {
    super(new long[] {1, 5, -6, 5}, new long[] {1, 5, 20, 77});
  }
}
