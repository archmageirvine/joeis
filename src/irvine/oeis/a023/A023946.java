package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023946 Expansion of g.f. 1/((1-x)*(1-5*x)*(1-10*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A023946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023946() {
    super(new long[] {-550, 765, -241, 27}, new long[] {1, 27, 488, 7434});
  }
}
