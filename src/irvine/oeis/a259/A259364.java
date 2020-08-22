package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259364 a(n) = 18*n^4*(2*n^3 - 23*n^2 + 38*n - 18)^2.
 * @author Sean A. Irvine
 */
public class A259364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259364() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 18, 93312, 4737042, 51775488, 263351250, 807055488, 1609827282, 1934917632, 774840978, 691920000});
  }
}
