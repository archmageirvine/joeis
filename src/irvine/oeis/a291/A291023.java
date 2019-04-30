package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291023 p-INVERT of <code>(1,1,1,1,1,...)</code>, where p(S) <code>= 1 - 3</code> S^2 <code>+ 2</code> S^3.
 * @author Sean A. Irvine
 */
public class A291023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291023() {
    super(new long[] {-4, 0, 3}, new long[] {0, 3, 4});
  }
}
