package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111926 Expansion of x^4/((1-2*x)*(x^2-x+1)*(x-1)^2).
 * @author Sean A. Irvine
 */
public class A111926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111926() {
    super(new long[] {2, -7, 11, -10, 5}, new long[] {0, 0, 0, 0, 1});
  }
}
