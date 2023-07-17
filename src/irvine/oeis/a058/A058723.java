package irvine.oeis.a058;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003106;
import irvine.oeis.a003.A003114;

/**
 * A058723 McKay-Thompson series of class 58a for the Monster group.
 * @author Sean A. Irvine
 */
public class A058723 extends A003114 {

  /** Construct the sequence. */
  public A058723() {
    super(-1);
  }

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Sequence mHSeq = new A003106();
  private final Polynomial<Z> mG = RING.empty();
  private final Polynomial<Z> mH = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mG.add(super.next());
    mH.add(mHSeq.next());
    return RING.multiply(mG, mG.substitutePower(29, mN), mN).coeff(mN)
      .add(mN < 6 ? Z.ZERO : RING.multiply(mH, mH.substitutePower(29, mN - 6), mN - 6).coeff(mN - 6));
  }
}
