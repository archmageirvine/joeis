package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107965 a(n) = (n+1)(n+2)^2*(n+3)^2*(n+4)(11n^4 + 110n^3 + 439n^2 + 820n + 600)/86400.
 * @author Sean A. Irvine
 */
public class A107965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107965() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 33, 421, 3171, 16954, 71148, 249228, 758934, 2066559, 5135845, 11828817});
  }
}
