package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262927 a(n+9) = a(n) + 10*(n+4) + 9. a(0)=0, a(1)=1, a(2)=3, a(3)=6, a(4)=10, a(5)=15, a(6)=23, a(7)=30, a(8)=39.
 * @author Sean A. Irvine
 */
public class A262927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262927() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 1, 3, 6, 10, 15, 23, 30, 39, 49, 60});
  }
}
