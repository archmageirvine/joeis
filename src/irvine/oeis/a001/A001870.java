package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001870 Expansion of <code>(1-x)/(1 - 3*x + x^2)^2</code>.
 * @author Sean A. Irvine
 */
public class A001870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001870() {
    super(new long[] {-1, 6, -11, 6}, new long[] {1, 5, 19, 65});
  }
}
