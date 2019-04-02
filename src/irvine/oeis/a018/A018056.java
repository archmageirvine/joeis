package irvine.oeis.a018;

import irvine.oeis.LinearRecurrence;

/**
 * A018056 Expansion of 1/((1-3*x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A018056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018056() {
    super(new long[] {216, -123, 20}, new long[] {1, 20, 277});
  }
}
