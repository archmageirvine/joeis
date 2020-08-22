package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070367 a(n) = 5^n mod 11.
 * @author Sean A. Irvine
 */
public class A070367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070367() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 5, 3, 4, 9});
  }
}
