package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087170 Expansion of <code>(1 + 4*x)/(1 + 7*x + 16*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A087170 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087170() {
    super(new long[] {-16, -7}, new long[] {1, -3});
  }
}
