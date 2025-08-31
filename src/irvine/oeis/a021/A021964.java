package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021964 Expansion of g.f. 1/((1-x)*(1-4*x)*(1-9*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A021964 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021964() {
    super(new long[] {-396, 575, -203, 25}, new long[] {1, 25, 422, 6050});
  }
}
