package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070368 a(n) = 5^n mod 13.
 * @author Sean A. Irvine
 */
public class A070368 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070368() {
    super(new long[] {1, -1, 1}, new long[] {1, 5, 12});
  }
}
