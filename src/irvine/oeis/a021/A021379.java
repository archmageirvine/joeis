package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021379 Expansion of <code>1/((1-x)(1-3x)(1-4x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A021379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021379() {
    super(new long[] {-108, 183, -91, 17}, new long[] {1, 17, 198, 2002});
  }
}
