package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092365 Coefficient of <code>X^2</code> in expansion of <code>(1 + n*X + n*X^2)^n</code>.
 * @author Sean A. Irvine
 */
public class A092365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092365() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 36, 112, 275});
  }
}
