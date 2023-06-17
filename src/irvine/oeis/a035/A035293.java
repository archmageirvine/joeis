package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004009;

/**
 * A035293 Fourier coefficients of T_6.
 * @author Sean A. Irvine
 */
public class A035293 extends AbstractSequence {

  /** Construct the sequence. */
  public A035293() {
    super(-1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mE4Seq = new A004009();
  private final Polynomial<Z> mE4 = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mE4.add(mE4Seq.next());
    return RING.coeff(RING.multiply(mE4, mE4, mN), RING.pow(RING.eta(RING.x(), mN), 24, mN), mN);
  }
}

