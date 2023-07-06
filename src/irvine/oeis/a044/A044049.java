package irvine.oeis.a044;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002212;
import irvine.oeis.a055.A055879;

/**
 * A044049 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A044049 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mUSeq = new PrependSequence(new A002212().skip(1), Z.ZERO);
  private final Sequence mVSeq = new PrependSequence(new A055879(), Z.ZERO);
  private final Polynomial<Z> mU = RING.empty();
  private final Polynomial<Z> mV = RING.empty();
  {
    mV.add(mVSeq.next());
  }

  private int mN = -1;

  @Override
  public Z next() {
    mU.add(mUSeq.next());
    mV.add(mVSeq.next());
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Polynomial<Z> u2 = mU.substitutePower(2, mN);
    return mU.coeff(mN)
      .add(mV.coeff(mN))
      .add(u2.coeff(mN))
      .add(RING.pow(mU, 2, mN).coeff(mN))
      .subtract(RING.multiply(u2, mV, mN).coeff(mN))
      .add(mV.substitutePower(3, mN).coeff(mN))
      .multiply(3)
      .add(RING.pow(mU, 3, mN).coeff(mN).subtract(mU.substitutePower(3, mN).coeff(mN)))
      .divide(6)
      .subtract(mV.coeff(mN + 1));
  }
}

