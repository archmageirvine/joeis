package irvine.oeis.a070;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A070421 a(n) = 7^n mod 38.
 * @author Sean A. Irvine
 */
public class A070421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070421() {
    super(new long[] {1, 0, 0}, new long[] {1, 7, 11});
  }
}
