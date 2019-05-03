package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261191 40-gonal numbers: <code>a(n) = 38*n*(n-1)/2 +</code> n.
 * @author Sean A. Irvine
 */
public class A261191 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261191() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 40});
  }
}
