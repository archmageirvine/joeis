package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017164 a(n) = (9*n)^4.
 * @author Sean A. Irvine
 */
public class A017164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017164() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6561, 104976, 531441, 1679616});
  }
}
