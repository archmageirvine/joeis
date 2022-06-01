package irvine.oeis.a161;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A161495 Expansion of x*(3*x-1)*(x-3)/(1-15*x+32*x^2-15*x^3+x^4).
 * @author Sean A. Irvine
 */
public class A161495 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161495() {
    super(new long[] {-1, 15, -32, 15}, new long[] {3, 35, 432, 5405});
  }
}
