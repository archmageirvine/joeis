package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176369 y-values in the solution to <code>x^2-65*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176369 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176369() {
    super(new long[] {-1, 258}, new long[] {0, 16});
  }
}
