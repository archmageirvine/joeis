package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.InverseMobiusTransformSequence;
import irvine.oeis.Sequence;

/**
 * A002791 a(n) = Sum_{d|n, d &lt;= 4} d^2 + 4*Sum_{d|n, d&gt;4} d.
 * @author Sean A. Irvine
 */
public class A002791 extends InverseMobiusTransformSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  private static class MySequence implements Sequence {
    private static final Polynomial<Z> NUM = Polynomial.create(0, 1, 2, 2, 2, -3);
    private static final Polynomial<Z> DEN = Polynomial.create(1, -2, 1);
    private int mN = 0;

    @Override
    public Z next() {
      return RING.coeff(NUM, DEN, ++mN);
    }
  }

  /** Construct the sequence. */
  public A002791() {
    super(new MySequence(), 0);
    next();
  }
}
