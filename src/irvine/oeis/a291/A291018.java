package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291018 p-INVERT of <code>(1,1,1,1,1,...)</code>, where <code>p(S) = 1 - 6 S + S^2</code>.
 * @author Sean A. Irvine
 */
public class A291018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291018() {
    super(new long[] {-8, 8}, new long[] {6, 41});
  }
}
