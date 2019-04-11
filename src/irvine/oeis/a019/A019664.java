package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019664 Expansion of <code>1/((1-4x)(1-8x)(1-9x))</code>.
 * @author Sean A. Irvine
 */
public class A019664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019664() {
    super(new long[] {288, -140, 21}, new long[] {1, 21, 301});
  }
}
