package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016145 Expansion of g.f. 1/((1-3*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A016145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016145() {
    super(new long[] {-30, 13}, new long[] {1, 13});
  }
}
