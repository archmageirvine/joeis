package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051274 Expansion of <code>(1+x^4)/((1-x^2)*(1-x^3))</code>.
 * @author Sean A. Irvine
 */
public class A051274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051274() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 2});
  }
}
