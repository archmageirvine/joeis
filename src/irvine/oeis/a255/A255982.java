package irvine.oeis.a255;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a237.A237018;
import irvine.oeis.triangle.Triangle;

/**
 * A255982 Number T(n,k) of partitions of the k-dimensional hypercube resulting from a sequence of n bisections, each of which splits any part perpendicular to any of the axes, such that each axis is used at least once; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A255982 extends Triangle {

  private A237018 mSeq = new A237018();

  /** Construct the sequence. */
  public A255982() {
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n, k, t) option remember; `if`(t=0, 1, `if`(t=1,
           A(n-1, k), add(A(j, k)*b(n-j-1, k, t-1), j=0..n-2)))
        end:
    A:= proc(n, k) option remember; `if`(n=0, 1,
          -add(binomial(k, j)*(-1)^j*b(n+1, k, 2^j), j=1..k))
        end:
    T:= (n, k)-> add(A(n, k-i)*(-1)^i*binomial(k, i), i=0..k):
    seq(seq(T(n, k), k=0..n), n=0..10);
  */

  @Override
  public Z compute(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(mSeq.getA(n, k - i).multiply(((i & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(k, i)));
    }
    return sum;
  }
}
