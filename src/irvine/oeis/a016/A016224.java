package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016224 Expansion of <code>1/((1-x)(1-4x)(1-8x))</code>.
 * @author Sean A. Irvine
 */
public class A016224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016224() {
    super(new long[] {32, -44, 13}, new long[] {1, 13, 125});
  }
}
