package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176364 y-values in the solution to <code>x^2-61*y^2=1</code>.
 * @author Sean A. Irvine
 */
public class A176364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176364() {
    super(new long[] {-1, 3532638098L}, new long[] {0, 226153980});
  }
}
