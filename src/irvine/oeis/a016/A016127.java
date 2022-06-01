package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016127 Expansion of 1/((1-2*x)*(1-5*x)).
 * @author Sean A. Irvine
 */
public class A016127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016127() {
    super(new long[] {-10, 7}, new long[] {1, 7});
  }
}
