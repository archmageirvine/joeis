package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291009 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = (1 - S)(1 - 3 S)</code>.
 * @author Sean A. Irvine
 */
public class A291009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291009() {
    super(new long[] {-8, 6}, new long[] {4, 17});
  }
}
