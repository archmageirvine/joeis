package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113954 Expansion of <code>(1-2x^2)/((1-2x)(1+x)^2)</code>.
 * @author Sean A. Irvine
 */
public class A113954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113954() {
    super(new long[] {2, 3, 0}, new long[] {1, 0, 1});
  }
}
