package irvine.oeis.a093;

import irvine.oeis.LinearRecurrence;

/**
 * A093137 Expansion of <code>(1-7*x)/((1-x)(1-10*x))</code>.
 * @author Sean A. Irvine
 */
public class A093137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A093137() {
    super(new long[] {-10, 11}, new long[] {1, 4});
  }
}
