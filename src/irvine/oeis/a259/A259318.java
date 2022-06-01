package irvine.oeis.a259;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A259318 a(n) = A259109(n)*A006331(n) - A259108(n)^2.
 * @author Sean A. Irvine
 */
public class A259318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259318() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 144, 6048, 85536, 679536, 3747744, 16039296, 56930688, 174978144, 479700144});
  }
}
