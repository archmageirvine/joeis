package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108306 Expansion of <code>(3*x+1)/(1-3*x-3*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A108306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108306() {
    super(new long[] {3, 3}, new long[] {1, 6});
  }
}
