package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018208 Expansion of <code>1/((1-3x)(1-11x)(1-12x))</code>.
 * @author Sean A. Irvine
 */
public class A018208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018208() {
    super(new long[] {396, -201, 26}, new long[] {1, 26, 475});
  }
}
