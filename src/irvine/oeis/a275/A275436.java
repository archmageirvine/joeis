package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275436 Sum of the asymmetry degrees of all 00-avoiding binary words of length <code>n</code>.
 * @author Sean A. Irvine
 */
public class A275436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275436() {
    super(new long[] {1, 1, -3, -2, 0, -2, 3, 1}, new long[] {0, 0, 2, 2, 8, 10, 30, 40});
  }
}
