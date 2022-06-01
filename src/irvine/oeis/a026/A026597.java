package irvine.oeis.a026;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A026597 Expansion of (1+x)/(1-x-4*x^2).
 * @author Sean A. Irvine
 */
public class A026597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026597() {
    super(new long[] {4, 1}, new long[] {1, 2});
  }
}
