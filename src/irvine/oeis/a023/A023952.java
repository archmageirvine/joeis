package irvine.oeis.a023;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A023952 Expansion of g.f. 1/((1-x)*(1-6*x)*(1-7*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A023952 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023952() {
    super(new long[] {-462, 647, -209, 25}, new long[] {1, 25, 416, 5822});
  }
}
