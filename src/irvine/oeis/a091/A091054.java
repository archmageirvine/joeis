package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091054 Expansion of <code>(1-5x+2x^2)/((1-x)(1+2x)(1-6x))</code>.
 * @author Sean A. Irvine
 */
public class A091054 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091054() {
    super(new long[] {-12, 8, 5}, new long[] {1, 0, 6});
  }
}
