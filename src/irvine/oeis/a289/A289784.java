package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289784 p-INVERT of the <code>(4^n)</code>, where <code>p(S) = 1 - S - S^2</code>.
 * @author Sean A. Irvine
 */
public class A289784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289784() {
    super(new long[] {-19, 9}, new long[] {1, 6});
  }
}
