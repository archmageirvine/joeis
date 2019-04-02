package irvine.oeis.a138;

import irvine.oeis.LinearRecurrence;

/**
 * A138750 a(n)=ceil(n/2) if n=2 (mod 3), a(n)=2n otherwise.
 * @author Sean A. Irvine
 */
public class A138750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A138750() {
    super(new long[] {-1, 0, 0, 1, 0, 0, 1, 0, 0}, new long[] {0, 2, 1, 6, 8, 3, 12, 14, 4});
  }
}
