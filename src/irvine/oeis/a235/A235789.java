package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235789 Expansion of <code>x * (1 - 2*x + 8*x^5 - 8*x^6) / (1 - 4*x^4)^2</code>.
 * @author Sean A. Irvine
 */
public class A235789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235789() {
    super(new long[] {8, 0, 4, 0, -2, 0}, new long[] {0, 1, -2, 0, 0, 8});
  }
}
