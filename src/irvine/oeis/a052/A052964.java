package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052964 Expansion of <code>(1-x)/((1-2x)(1+x-x^2))</code>.
 * @author Sean A. Irvine
 */
public class A052964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052964() {
    super(new long[] {-2, 3, 1}, new long[] {1, 0, 3});
  }
}
