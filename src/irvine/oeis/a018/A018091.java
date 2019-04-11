package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018091 Expansion of <code>1/((1-3x)(1-9x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A018091 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018091() {
    super(new long[] {297, -159, 23}, new long[] {1, 23, 370});
  }
}
