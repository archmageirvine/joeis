package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017521 Expansion of <code>1/((1-3x)(1-5x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A017521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017521() {
    super(new long[] {120, -79, 16}, new long[] {1, 16, 177});
  }
}
