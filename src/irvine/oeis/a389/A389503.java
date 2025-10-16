package irvine.oeis.a389;

/**
 * A389503 a(n) = Sum_{i=1..n} (Product_{j=1..n} M(j, ((i+j-2) mod n)+1) - Product_{j=1..n} M(j, ((i-j-1) mod n)+1)) where M is an n X n Toeplitz matrix whose first row consists of successive positive integer numbers 1, ..., n and whose first column consists of 1, n + 1, ..., 2*n - 1.
 * @author Sean A. Irvine
 */
public class A389503 extends A389427 {

  @Override
  protected long m(final int i, final int j, final int n) {
    return (i <= j ? 1 : n) + Math.abs(i - j);
  }
}
