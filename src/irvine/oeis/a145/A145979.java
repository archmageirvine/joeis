package irvine.oeis.a145;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A145979 a(n) = (2*n + 4)/gcd(n,4).
 * @author Sean A. Irvine
 */
public class A145979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145979() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {1, 6, 4, 10, 3, 14, 8, 18});
  }
}
