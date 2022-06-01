package irvine.oeis.a261;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A261343 50-gonal numbers: a(n) = 48*n*(n-1)/2 + n.
 * @author Sean A. Irvine
 */
public class A261343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261343() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 50});
  }
}
