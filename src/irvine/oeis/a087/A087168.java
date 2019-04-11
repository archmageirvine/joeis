package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087168 Expansion of <code>(1+2*x)/(1+3*x+4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A087168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087168() {
    super(new long[] {-4, -3}, new long[] {1, -1});
  }
}
