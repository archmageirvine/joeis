package irvine.oeis.a116;
// manually adiveo at 2022-05-30 21:19

import irvine.oeis.a068.A068915;

/**
 * A116526 a(0)=1, a(1)=1, a(n) = 9*a(n/2) for even n &gt;= 2, and a(n) = 8*a((n-1)/2) + a((n+1)/2) for odd n &gt;= 3.
 * @author Georg Fischer
 */
public class A116526 extends A068915 {

  /** Construct the sequence */
  public A116526() {
    super(0, 2, 0, 1);
  }

  @Override
  protected void initialize() {
    mFuncF = n -> a((n - 1) / 2).multiply(8).add(a((n + 1) / 2));
    mFuncT = n -> a(n / 2).multiply(9);
  }
}
