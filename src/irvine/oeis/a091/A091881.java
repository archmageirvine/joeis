package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091881 Expansion of <code>(1-11x)/((1-x)(1-16x))</code>.
 * @author Sean A. Irvine
 */
public class A091881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091881() {
    super(new long[] {-16, 17}, new long[] {1, 6});
  }
}
