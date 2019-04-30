package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099397 Chebyshev's polynomial of the first kind, <code>T(n,x)</code>, evaluated at <code>x=51</code>.
 * @author Sean A. Irvine
 */
public class A099397 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099397() {
    super(new long[] {-1, 102}, new long[] {1, 51});
  }
}
