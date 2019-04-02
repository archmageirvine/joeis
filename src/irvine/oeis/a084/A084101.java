package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084101 Expansion of (1+x)^2/((1-x)*(1+x^2)).
 * @author Sean A. Irvine
 */
public class A084101 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084101() {
    super(new long[] {1, -1, 1}, new long[] {1, 3, 3});
  }
}
