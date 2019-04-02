package irvine.oeis.a108;

import irvine.oeis.LinearRecurrence;

/**
 * A108765 G.f. (1 - x + x^2)/((1-3*x)*(x-1)^2).
 * @author Sean A. Irvine
 */
public class A108765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108765() {
    super(new long[] {3, -7, 5}, new long[] {1, 4, 14});
  }
}
