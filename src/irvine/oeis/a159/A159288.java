package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159288 Expansion of <code>(1+x+x^2)/(1-x^2-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A159288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159288() {
    super(new long[] {2, 1, 0}, new long[] {1, 1, 2});
  }
}
