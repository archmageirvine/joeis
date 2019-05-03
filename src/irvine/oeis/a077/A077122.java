package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077122 Let <code>M_n</code> be the <code>n X n</code> matrix <code>M_(i,j) = 2^i-2^j</code> then the characteristic polynomial of <code>M_n = x^n-a(n)*x^(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A077122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077122() {
    super(new long[] {32, -96, 106, -53, 12}, new long[] {0, 4, 56, 460, 2976});
  }
}
