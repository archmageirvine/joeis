package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016290 Expansion of <code>1/((1-2x)(1-4x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A016290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016290() {
    super(new long[] {64, -56, 14}, new long[] {1, 14, 140});
  }
}
