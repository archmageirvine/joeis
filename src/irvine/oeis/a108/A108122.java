package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108122 G.f.: (1-2*x^2)/(1-x-2*x^2-x^3).
 * @author Sean A. Irvine
 */
public class A108122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108122() {
    super(new long[] {1, 2, 1}, new long[] {1, 1, 1});
  }
}
