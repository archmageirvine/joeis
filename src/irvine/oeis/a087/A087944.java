package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087944 Expansion of (1-4*x+3*x^2)/((1-2*x)*(1-4*x+x^2)).
 * @author Sean A. Irvine
 */
public class A087944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087944() {
    super(new long[] {2, -9, 6}, new long[] {1, 2, 6});
  }
}
