package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095897 Expansion of x*(1+4*x-4*x^2)/((1+2*x)*(1-6*x)*(1-8*x^2)).
 * @author Sean A. Irvine
 */
public class A095897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095897() {
    super(new long[] {-96, -32, 20, 4}, new long[] {1, 8, 48, 320});
  }
}
