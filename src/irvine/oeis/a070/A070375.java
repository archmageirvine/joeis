package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070375 a(n) = 5^n mod 22.
 * @author Sean A. Irvine
 */
public class A070375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070375() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 5, 3, 15, 9});
  }
}
