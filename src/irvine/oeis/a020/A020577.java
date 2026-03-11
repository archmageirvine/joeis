package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020577 Expansion of g.f. 1/((1 - 6*x)*(1 - 7*x)*(1 - 12*x)).
 * @author Sean A. Irvine
 */
public class A020577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020577() {
    super(new long[] {504, -198, 25}, new long[] {1, 25, 427});
  }
}
