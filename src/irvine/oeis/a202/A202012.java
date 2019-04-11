package irvine.oeis.a202;

import irvine.oeis.LinearRecurrence;

/**
 * A202012 Expansion of <code>(1-x+x^2)/((1-x)(1-x-x^2-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A202012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202012() {
    super(new long[] {-1, 0, 0, 2}, new long[] {1, 1, 3, 6});
  }
}
