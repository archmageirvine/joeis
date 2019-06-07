package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176971 Expansion of <code>(1+x)/(1+x-x^3)</code> in powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A176971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176971() {
    super(new long[] {1, 0, -1}, new long[] {1, 0, 0});
  }
}
