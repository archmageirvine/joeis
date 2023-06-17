package irvine.oeis.a035;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004009;
import irvine.oeis.a013.A013973;

/**
 * A035281 Fourier coefficients of T_4.
 * @author Sean A. Irvine
 */
public class A035281 extends AbstractSequence {

  /* Construct the sequence. */
  public A035281() {
    super(-1);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mE4Seq = new A004009();
  private final Sequence mE6Seq = new A013973();
  private final Polynomial<Z> mE4 = RING.empty();
  private final Polynomial<Z> mE6 = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mE4.add(mE4Seq.next());
    mE6.add(mE6Seq.next());
    return RING.coeff(RING.multiply(mE4, mE6, mN), RING.pow(RING.eta(RING.x(), mN), 24, mN), mN);
  }
}

