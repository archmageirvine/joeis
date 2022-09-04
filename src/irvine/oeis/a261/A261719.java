package irvine.oeis.a261;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A261719 Number T(n,k) of partitions of n where each part i is marked with a word of length i over a k-ary alphabet whose letters appear in alphabetical order and all k letters occur at least once in the partition; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A261719 extends BaseTriangle {

  /** Construct the sequence. */
  public A261719() {
    super(0, 0, 0);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, i, k) option remember; `if`(n=0, 1, `if`(i<1, 0,
          b(n, i-1, k)+`if`(i>n, 0, b(n-i, i, k)*binomial(i+k-1, k-1))))
        end:
    T:= (n, k)-> add(b(n$2, k-i)*(-1)^i*binomial(k, i), i=0..k):
    seq(seq(T(n, k), k=0..n), n=0..10);
  */
  @Override
  public Z triangleElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(A261718.B.get(n, n, k - i).multiply(((i & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(k, i)));
    }
    return sum;
  }
}
