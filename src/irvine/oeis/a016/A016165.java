package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016165 Expansion of 1/((1-5*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016165 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016165() {
    super(new long[] {-55, 16}, new long[] {1, 16});
  }
}
