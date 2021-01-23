package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099275 Unsigned member r=-17 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A099275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099275() {
    super(new long[] {-1, 18, 18}, new long[] {0, 1, 17});
  }
}
