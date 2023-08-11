package irvine.oeis.a213;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A213027 Number A(n,k) of 3n-length k-ary words, either empty or beginning with the first letter of the alphabet, that can be built by repeatedly inserting triples of identical letters into the initially empty word; square array A(n,k), n&gt;=0, k&gt;=0, by antidiagonals.
 * that can be built by repeatedly inserting triples of identical letters into the initially empty word;
 * square array A(n,k), n&gt;=0, k&gt;=0, by antidiagonals.
 * @author Georg Fischer
 */
public class A213027 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A213027() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    A:= (n, k)-> `if`(n=0, 1, `if`(k<2, k,
    1/n *add(binomial(3*n, j) *(n-j) *(k-1)^j, j=0..n-1))):
    seq(seq(A(n, d-n), n=0..d), d=0..12);  
  */
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (k < 2) {
        return Z.valueOf(k);
      }
      Z sum = Z.ZERO;
      for (int j = 0; j < n; ++j) {
        sum = sum.add(Binomial.binomial(3L * n, j).multiply(n - j).multiply(Z.valueOf(k - 1).pow(j)));
      }
      return sum.divide(n);
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return mB.get(n, k);
  }
}
