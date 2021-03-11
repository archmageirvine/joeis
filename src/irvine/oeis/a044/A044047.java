package irvine.oeis.a044;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a002.A002212;
import irvine.oeis.a055.A055879;

/**
 * A044047 Catafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A044047 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mUSeq = new PrependSequence(new SkipSequence(new A002212(), 1), Z.ZERO);
  private final Sequence mVSeq = new PrependSequence(new A055879(), Z.ZERO);
  private final Polynomial<Z> mU = RING.empty();
  private final Polynomial<Z> mV = RING.empty();

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mU.add(mUSeq.next());
    mV.add(mVSeq.next());
    return RING.multiply(mU.substitutePower(2, mN), mV, mN).coeff(mN).multiply(3)
      .add(RING.pow(mU, 3, mN).coeff(mN))
      .add(mU.substitutePower(3, mN).coeff(mN).multiply2())
      .divide(6);
  }
}

