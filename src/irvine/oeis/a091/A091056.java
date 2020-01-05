package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091056 Expansion of <code>x^2/((1-x)*(1+2*x)*(1-6*x))</code>.
 * @author Sean A. Irvine
 */
public class A091056 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091056() {
    super(new long[] {-12, 8, 5}, new long[] {0, 0, 1});
  }
}
