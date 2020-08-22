package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099761 a(n) = ( n*(n+2) )^2.
 * @author Sean A. Irvine
 */
public class A099761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099761() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 9, 64, 225, 576});
  }
}
