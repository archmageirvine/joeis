package irvine.oeis.a269;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A269877 a(n) = 2^(4*n-3)*n*(2*n-1)*(900*n^4-4500*n^3+8895*n^2-8055*n+2764), a closed form for a double binomial sum involving absolute values.
 * @author Sean A. Irvine
 */
public class A269877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A269877() {
    super(new long[] {268435456, -117440512, 22020096, -2293760, 143360, -5376, 112}, new long[] {0, 8, 121728, 77214720, 12676235264L, 1090372239360L, 64922717257728L});
  }
}
