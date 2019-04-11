package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052903 Expansion of <code>(1-x^3)/(1-2x-x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A052903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052903() {
    super(new long[] {-1, 1, 0, 2}, new long[] {1, 2, 4, 8});
  }
}
