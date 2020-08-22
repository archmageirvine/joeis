package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077122 Let M_n be the n X n matrix M_(i,j) = 2^i-2^j then the characteristic polynomial of M_n = x^n-a(n)*x^(n-2).
 * @author Sean A. Irvine
 */
public class A077122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077122() {
    super(new long[] {32, -96, 106, -53, 12}, new long[] {0, 4, 56, 460, 2976});
  }
}
