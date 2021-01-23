package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099271 Unsigned member r=-13 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A099271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099271() {
    super(new long[] {-1, 14, 14}, new long[] {0, 1, 13});
  }
}
