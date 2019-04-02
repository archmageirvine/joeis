package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098297 Member r=12 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098297 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098297() {
    super(new long[] {1, -11, 11}, new long[] {0, 1, 12});
  }
}
