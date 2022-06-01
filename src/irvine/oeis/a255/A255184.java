package irvine.oeis.a255;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A255184 25-gonal numbers: a(n) = n*(23*n-21)/2.
 * @author Sean A. Irvine
 */
public class A255184 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255184() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 25});
  }
}
