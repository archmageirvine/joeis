package irvine.oeis.a261;

import irvine.math.MemoryFunctionInt4;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A261835 Number A(n,k) of compositions of n into distinct parts where each part i is marked with a word of length i over a k-ary alphabet whose letters appear in alphabetical order; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * with a word of length i over a k-ary alphabet whose letters appear in alphabetical order; square array A(n,k), n&gt;=0, k&gt;=0, read by antidiagonals.
 * @author Georg Fischer
 */
public class A261835 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A261835() {
    super(0, 0, -1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, p, k) option remember;
          `if`(i*(i+1)/2<n, 0, `if`(n=0, p!, b(n, i-1, p, k)+
          `if`(i>n, 0, b(n-i, i-1, p+1, k)*binomial(i+k-1, k-1))))
        end:
    A:= (n, k)-> b(n$2, 0, k):
    seq(seq(A(n, d-n), n=0..d), d=0..12);
  */
  protected static final MemoryFunctionInt4<Z> B = new MemoryFunctionInt4<>() { // mB used in A261836
    @Override
    protected Z compute(final int n, final int i, final int p, final int k) {
      if (i * (i + 1) / 2 < n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Functions.FACTORIAL.z(p);
      }
      Z sum = get(n, i - 1, p, k);
      if (i <= n) {
        sum = sum.add(get(n - i, i - 1, p + 1, k).multiply(Binomial.binomial(i + k - 1, k - 1)));
      }
      return sum;
    }
  };

  @Override
  public Z matrixElement(final int n, final int k) {
    return B.get(n, n, 0, k);
  }
}
