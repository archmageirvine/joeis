package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016205 Expansion of g.f. 1/((1-x)*(1-2*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016205() {
    super(new long[] {20, -32, 13}, new long[] {1, 13, 137});
  }
}
