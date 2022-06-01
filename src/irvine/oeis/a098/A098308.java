package irvine.oeis.a098;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A098308 Unsigned member r=-8 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A098308 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098308() {
    super(new long[] {-1, 9, 9}, new long[] {0, 1, 8});
  }
}
