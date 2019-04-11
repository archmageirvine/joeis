package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104771 G.f. <code>(1-x+x^2)/(1+x-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A104771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104771() {
    super(new long[] {1, 0, -1}, new long[] {1, -2, 3});
  }
}
