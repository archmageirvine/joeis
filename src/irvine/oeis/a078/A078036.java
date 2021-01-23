package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078036 Expansion of (1-x)/(1+2*x^2+x^3).
 * @author Sean A. Irvine
 */
public class A078036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078036() {
    super(new long[] {-1, -2, 0}, new long[] {1, -1, -2});
  }
}
