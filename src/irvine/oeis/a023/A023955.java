package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023955 Expansion of g.f. 1/((1-x)*(1-6*x)*(1-8*x)*(1-10*x)).
 * @author Sean A. Irvine
 */
public class A023955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023955() {
    super(new long[] {-480, 668, -212, 25}, new long[] {1, 25, 413, 5693});
  }
}
