package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098307 Unsigned member r=-7 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098307() {
    super(new long[] {-1, 8, 8}, new long[] {0, 1, 7});
  }
}
