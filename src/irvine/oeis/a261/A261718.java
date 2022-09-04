package irvine.oeis.a261;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A261718 Number A(n,k) of partitions of n where each part i is marked with a word of length i over a k-ary alphabet whose letters appear in alphabetical order; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A261718 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A261718() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
          b(n, i-1, k)+`if`(i>n, 0, b(n-i, i, k)*binomial(i+k-1, k-1))))
        end:
    A:= (n, k)-> b(n, n, k):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  protected static final MemoryFunctionInt3<Z> B = new MemoryFunctionInt3<Z>() { // used in A261719
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1) {
        return Z.ZERO;
      }
      Z sum = get(n, i - 1, k);
      if (i <= n) {
        sum = sum.add(get(n - i, i, k).multiply(Binomial.binomial(i + k - 1, k - 1)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return B.get(n, n, k);
  }
}
