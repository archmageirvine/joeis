package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082044 Main diagonal of A082043: a(n) = n^4 + 2*n^2 + 1.
 * @author Sean A. Irvine
 */
public class A082044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082044() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 4, 25, 100, 289});
  }
}
