package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098299 Member r=14 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098299() {
    super(new long[] {1, -13, 13}, new long[] {0, 1, 14});
  }
}
