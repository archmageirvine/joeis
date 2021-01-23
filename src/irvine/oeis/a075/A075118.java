package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075118 Variant on Lucas numbers: a(n) = a(n-1) + 3*a(n-2) with a(0)=2 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A075118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075118() {
    super(new long[] {3, 1}, new long[] {2, 1});
  }
}
