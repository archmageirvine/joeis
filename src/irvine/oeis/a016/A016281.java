package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016281 Expansion of <code>1/((1-2x)(1-3x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A016281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016281() {
    super(new long[] {72, -66, 17}, new long[] {1, 17, 223});
  }
}
