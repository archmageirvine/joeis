package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020766 Expansion of g.f. 1/((1-6*x)*(1-11*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A020766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020766() {
    super(new long[] {792, -270, 29}, new long[] {1, 29, 571});
  }
}
