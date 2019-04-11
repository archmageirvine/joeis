package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124745 Expansion of <code>(1+x)/(1-x^2+x^3)</code>.
 * @author Sean A. Irvine
 */
public class A124745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124745() {
    super(new long[] {-1, 1, 0}, new long[] {1, 1, 1});
  }
}
