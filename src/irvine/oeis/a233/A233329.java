package irvine.oeis.a233;

import irvine.oeis.LinearRecurrence;

/**
 * A233329 Expansion of <code>(1+4*x+x^2)/((1+x)^2*(1-x)^5)</code>.
 * @author Sean A. Irvine
 */
public class A233329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A233329() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {1, 7, 21, 51, 102, 186, 310});
  }
}
