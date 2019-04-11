package irvine.oeis.a219;

import irvine.oeis.LinearRecurrence;

/**
 * A219721 Expansion of <code>(1+7*x+5*x^2+7*x^3+x^4)/(1-x-x^4+x^5)</code>.
 * @author Sean A. Irvine
 */
public class A219721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A219721() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 8, 13, 20, 22});
  }
}
