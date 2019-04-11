package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019040 Expansion of <code>1/((1-4x)(1-5x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A019040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019040() {
    super(new long[] {220, -119, 20}, new long[] {1, 20, 281});
  }
}
