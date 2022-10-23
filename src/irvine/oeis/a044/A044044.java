package irvine.oeis.a044;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a055.A055879;

/**
 * A044044 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A044044 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mUSeq = new PrependSequence(new SkipSequence(new A002212(), 1), Z.ZERO);
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
    return RING.multiply(mU.substitutePower(2, mN), mV, mN).coeff(mN)
      .add(mV.coeff(mN + 1))
      .subtract(mV.substitutePower(3, mN).coeff(mN));
  }
}

