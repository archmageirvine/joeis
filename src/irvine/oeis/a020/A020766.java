package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020766 Expansion of <code>1/((1-6x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A020766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020766() {
    super(new long[] {792, -270, 29}, new long[] {1, 29, 571});
  }
}
