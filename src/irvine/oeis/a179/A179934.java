package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179934 Expansion of x*(4+5*x-13*x^2-x^3+x^4) / ( (1-x)*(1-10*x^2+x^4) ).
 * @author Sean A. Irvine
 */
public class A179934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179934() {
    super(1, new long[] {1, -1, -10, 10, 1}, new long[] {4, 9, 36, 85, 352});
  }
}
