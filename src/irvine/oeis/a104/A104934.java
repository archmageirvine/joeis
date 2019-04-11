package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104934 Expansion of <code>(1-x)/(1 - 3*x - 2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A104934 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104934() {
    super(new long[] {2, 3}, new long[] {1, 2});
  }
}
