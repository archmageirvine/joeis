package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176382 x-values in the solution to <code>x^2-73*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176382() {
    super(new long[] {-1, 4562498}, new long[] {1, 2281249});
  }
}
