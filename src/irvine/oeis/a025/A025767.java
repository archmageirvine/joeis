package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025767 Expansion of 1/((1-x)*(1-x^3)*(1-x^4)).
 * @author Sean A. Irvine
 */
public class A025767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025767() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3, 3, 4, 5});
  }
}
