package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019483 Expansion of <code>1/((1-4x)(1-6x)(1-10x))</code>.
 * @author Sean A. Irvine
 */
public class A019483 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019483() {
    super(new long[] {240, -124, 20}, new long[] {1, 20, 276});
  }
}
