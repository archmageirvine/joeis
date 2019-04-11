package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024137 <code>a(n) = 11^n - n^10</code>.
 * @author Sean A. Irvine
 */
public class A024137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024137() {
    super(new long[] {-11, 122, -616, 1870, -3795, 5412, -5544, 4092, -2145, 770, -176, 22}, new long[] {1, 10, -903, -57718, -1033935, -9604574, -58694615, -262988078, -859382943, -1128836710, 15937424601L, 259374246010L});
  }
}
