package irvine.oeis.a078;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A078044 Expansion of (1-x)/(1+x+2*x^3).
 * @author Sean A. Irvine
 */
public class A078044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078044() {
    super(new long[] {-2, 0, -1}, new long[] {1, -2, 2});
  }
}
