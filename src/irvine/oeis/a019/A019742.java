package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019742 Expansion of <code>1/((1-4x)(1-10x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A019742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019742() {
    super(new long[] {440, -194, 25}, new long[] {1, 25, 431});
  }
}
