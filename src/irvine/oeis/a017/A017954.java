package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017954 Expansion of <code>1/((1-3x)(1-6x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A017954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017954() {
    super(new long[] {216, -126, 21}, new long[] {1, 21, 315});
  }
}
