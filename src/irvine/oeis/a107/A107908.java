package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107908 a(n) = (n+1)(n+2)^2*(n+3)^2*(n+4)(3n+5)/720.
 * @author Sean A. Irvine
 */
public class A107908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107908() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 16, 110, 490, 1666, 4704, 11592, 25740});
  }
}
