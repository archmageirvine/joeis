package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261276 100-gonal numbers: <code>a(n) = 98*n*(n-1)/2 +</code> n.
 * @author Sean A. Irvine
 */
public class A261276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261276() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 100});
  }
}
