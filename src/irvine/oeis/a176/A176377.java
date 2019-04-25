package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176377 x-values in the solution to <code>x^2-70*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176377() {
    super(new long[] {-1, 502}, new long[] {1, 251});
  }
}
