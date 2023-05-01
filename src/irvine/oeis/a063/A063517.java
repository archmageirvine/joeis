package irvine.oeis.a063;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000594;
import irvine.oeis.a004.A004009;

/**
 * A063517 Theta series of 48-dimensional even unimodular lattice midway between A_48 and A^*_48.
 * @author Sean A. Irvine
 */
public class A063517 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Z Z912 = Z.valueOf(912);
  private static final Z Z240456 = Z.valueOf(240456);
  private final Sequence mE4Seq = new A004009();
  private final Sequence mDelta12Seq = new PrependSequence(new A000594(), 0);
  private final Polynomial<Z> mE4 = RING.empty();
  private final Polynomial<Z> mDel12 = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mE4.add(mE4Seq.next());
    mDel12.add(mDelta12Seq.next());
    final Polynomial<Z> b = RING.multiply(RING.multiply(RING.pow(mE4, 3, mN), mDel12, mN), Z912);
    final Polynomial<Z> c = RING.multiply(RING.pow(mDel12, 2, mN), Z240456);
    return RING.subtract(RING.add(RING.pow(mE4, 6, mN), b), c).coeff(mN);
  }
}
