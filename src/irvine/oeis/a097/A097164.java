package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097164 Expansion of <code>(1+3x)/((1-x)(1-4x^2))</code>.
 * @author Sean A. Irvine
 */
public class A097164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097164() {
    super(new long[] {-4, 4, 1}, new long[] {1, 4, 8});
  }
}
