package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098306 Unsigned member r=-6 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098306 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098306() {
    super(new long[] {-1, 7, 7}, new long[] {0, 1, 6});
  }
}
