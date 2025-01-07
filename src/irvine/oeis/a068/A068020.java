package irvine.oeis.a068;

/**
 * A068020 a(n) = Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=3.
 * @author Sean A. Irvine
 */
public class A068020 extends A068026 {

  /** Construct the sequence. */
  public A068020() {
    super(3);
  }
}

