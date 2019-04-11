package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105082 Expansion of <code>(5+4x)/(1-2x-x^2)</code>.
 * @author Sean A. Irvine
 */
public class A105082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105082() {
    super(new long[] {1, 2}, new long[] {5, 14});
  }
}
