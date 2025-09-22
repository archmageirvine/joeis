package irvine.oeis.a114;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A114543 Expansion of x*(1+x)/((1+2*x)*(1-2*x-768*x^2)).
 * @author Sean A. Irvine
 */
public class A114543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A114543() {
    super(new long[] {1536, 772, 0}, new long[] {0, 1, 1});
  }
}
