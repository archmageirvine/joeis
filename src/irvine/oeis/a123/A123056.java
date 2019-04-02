package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123056 Values of X satisfying the equation (X-Y)^4-2XY=0 with integer X&gt;=Y&gt;=0.
 * @author Sean A. Irvine
 */
public class A123056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123056() {
    super(new long[] {-1, 40, -206, 40}, new long[] {0, 4, 108, 3500});
  }
}
