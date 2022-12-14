package irvine.oeis.a263;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A263101 a(n) = F(F(n)) mod F(n), where F = Fibonacci = A000045.
 * @author Georg Fischer
 */
public class A263101 extends AbstractSequence {

  private int mN = 0;
  private static final MatrixRing<Z> RING = new MatrixRing<>(2, Integers.SINGLETON);
  private static final Matrix<Z> M0111 = new DefaultMatrix<>(new Z[][]{{Z.ZERO, Z.ONE}, {Z.ONE, Z.ONE}}, Z.ZERO);
  private static final Matrix<Z> M1001 = new DefaultMatrix<>(new Z[][]{{Z.ONE, Z.ZERO}, {Z.ZERO, Z.ONE}}, Z.ZERO);

  /** Construct the sequence. */
  public A263101() {
    super(1);
  }

  /* Maple:
  F:= n-> (<<0|1>, <1|1>>^n)[1, 2]:
  p:= proc(M, n, k) 
    `if`(n=0, <<1|0>, <0|1>>,
    `if`(n::even, p(M, n/2, k)^2, p(M, n-1, k).M)) mod k end;
  a:= n-> p(<<0|1>, <1|1>>, F(n)$2)[1, 2]:
  seq(a(n), n=1..50);
  */

  private Z f(final int n) {
    return RING.pow(M0111, n).get(0, 1);
  }

  private Matrix<Z> p(final MatrixRing<Z> ring, final Matrix<Z> m, final Z n) {
    if (n.isZero()) {
      return M1001;
    }
    return !n.testBit(0) ? ring.pow(p(ring, m, n.divide2()), 2) : ring.multiply(p(ring, m, n.subtract(1)), m);
  }

  @Override
  public Z next() {
    ++mN;
    final Z fn = f(mN);
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(fn));
    return p(ring, M0111, fn).get(0, 1);
  }
}
