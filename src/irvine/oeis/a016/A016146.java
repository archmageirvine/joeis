package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016146 Expansion of <code>1/((1-3x)(1-11x))</code>.
 * @author Sean A. Irvine
 */
public class A016146 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016146() {
    super(new long[] {-33, 14}, new long[] {1, 14});
  }
}
