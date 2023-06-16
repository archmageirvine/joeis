package irvine.oeis.a274;

import irvine.math.api.Matrix;
import irvine.math.group.IntegersMod;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007570;

/**
 * A274996 a(n) = F(F(F(n))) mod F(F(n)), where F = Fibonacci = A000045.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A274996 extends AbstractSequence {

  // After Alois P. Heinz

  private static final Z[][] C1 = {{Z.ZERO, Z.ONE}, {Z.ONE, Z.ONE}};

  private final A007570 mSeq2 = new A007570();

  /** Construct the sequence. */
  public A274996() {
    super(1);
    mSeq2.next();
  }

  private Z f(final Z n, final Z mod) {
    final MatrixRing<Z> ring = new MatrixRing<>(2, new IntegersMod(mod));
    Matrix<Z> r = ring.one();
    Matrix<Z> m = new DefaultMatrix<>(C1, Z.ZERO);
    Z p = n;
    while (!p.isZero()) {
      if (p.isOdd()) {
        r = ring.multiply(r, m);
      }
      m = ring.multiply(m, m);
      p = p.divide2();
    }
    return r.get(0, 1).mod(mod);
  }

  @Override
  public Z next() {
    final Z t = mSeq2.next();
    return f(t, t);
  }
}
