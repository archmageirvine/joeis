package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164111 Expansion of <code>(1-x)/(1+4*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A164111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164111() {
    super(new long[] {-4, 0}, new long[] {1, -1});
  }
}
