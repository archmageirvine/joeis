package irvine.oeis.a019;

import irvine.oeis.LinearRecurrence;

/**
 * A019041 Expansion of <code>1/((1-4x)(1-5x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A019041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A019041() {
    super(new long[] {240, -128, 21}, new long[] {1, 21, 313});
  }
}
