package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019490 Expansion of <code>1/((1-4x)(1-6x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A019490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019490() {
    super(new long[] {288, -144, 22}, new long[] {1, 22, 340});
  }
}
