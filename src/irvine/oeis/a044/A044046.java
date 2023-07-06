package irvine.oeis.a044;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002212;

/**
 * A044046 Nonisomorphic catacondensed monoheptafusenes (see reference for precise definition).
 * @author Sean A. Irvine
 */
public class A044046 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mUSeq = new PrependSequence(new A002212().skip(1), Z.ZERO);
  private final Polynomial<Z> mU = RING.empty();

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mU.add(mUSeq.next());
    return RING.pow(mU, 2, mN).coeff(mN).add(mU.substitutePower(2, mN).coeff(mN)).divide2();
  }
}

