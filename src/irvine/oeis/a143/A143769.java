package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143769 Expansion of 3*x*(3*x+1)*(2*x-1) / ( (1+x)*(3*x^2+1) ).
 * @author Sean A. Irvine
 */
public class A143769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143769() {
    super(new long[] {-3, -3, -1}, new long[] {-3, 0, 27});
  }
}
