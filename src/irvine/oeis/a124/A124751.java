package irvine.oeis.a124;

import irvine.oeis.LinearRecurrence;

/**
 * A124751 Expansion of <code>(1+x^2+x^4)/(1-x^6+x^7)</code>.
 * @author Sean A. Irvine
 */
public class A124751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A124751() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0}, new long[] {1, 0, 1, 0, 1, 0, 1});
  }
}
