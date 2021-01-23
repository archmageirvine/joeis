package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139268 Twice nonagonal numbers (or twice 9-gonal numbers): a(n) = n(7n-5).
 * @author Sean A. Irvine
 */
public class A139268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139268() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 18});
  }
}
