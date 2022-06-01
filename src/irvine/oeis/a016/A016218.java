package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016218 Expansion of 1/((1-x)*(1-4*x)*(1-5*x)).
 * @author Sean A. Irvine
 */
public class A016218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016218() {
    super(new long[] {20, -29, 10}, new long[] {1, 10, 71});
  }
}
