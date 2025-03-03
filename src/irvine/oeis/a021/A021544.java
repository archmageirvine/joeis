package irvine.oeis.a021;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A021544 Expansion of g.f. 1/((1 - x)*(1 - 3*x)*(1 - 7*x)*(1 - 8*x)).
 * @author Sean A. Irvine
 */
public class A021544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021544() {
    super(new long[] {-168, 269, -119, 19}, new long[] {1, 19, 242, 2606});
  }
}
