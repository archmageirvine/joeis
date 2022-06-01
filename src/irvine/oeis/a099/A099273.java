package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099273 Unsigned member r=-15 of the family of Chebyshev sequences S_r(n) defined in A092184.
 * @author Sean A. Irvine
 */
public class A099273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099273() {
    super(new long[] {-1, 16, 16}, new long[] {0, 1, 15});
  }
}
