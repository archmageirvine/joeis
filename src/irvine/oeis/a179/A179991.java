package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179991 Nonhomogeneous three-term sequence a(n) = a(n-1) + a(n-2) + n.
 * @author Sean A. Irvine
 */
public class A179991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179991() {
    super(1, new long[] {1, -1, -2, 3}, new long[] {2, 3, 8, 15});
  }
}
