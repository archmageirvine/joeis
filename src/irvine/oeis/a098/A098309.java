package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098309 Unsigned member r = -10 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098309() {
    super(new long[] {-1, 11, 11}, new long[] {0, 1, 10});
  }
}
