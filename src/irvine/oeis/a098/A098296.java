package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098296 Member r=11 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098296() {
    super(new long[] {1, -10, 10}, new long[] {0, 1, 11});
  }
}
