package irvine.oeis.a058;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003106;
import irvine.oeis.a003.A003114;

/**
 * A058708 McKay-Thompson series of class 54A for the Monster group.
 * @author Sean A. Irvine
 */
public class A058708 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final Sequence mSeqH = new A003106();
  private final Sequence mSeqG = new A003114();
  private final Polynomial<Z> mH = RING.create(Collections.emptyList());
  private final Polynomial<Z> mG = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    mG.add(mSeqG.next());
    mH.add(mSeqH.next());
    if (++mN == 1) {
      return Z.ZERO;
    }

    final Polynomial<Z> a = RING.multiply(mG, mG.substitutePower(54, mN), mN);
    final Polynomial<Z> b = RING.multiply(mH, mH.substitutePower(54, mN), mN);
    final Polynomial<Z> c = RING.add(a, b.shift(11));

    final Polynomial<Z> d = RING.multiply(mH.substitutePower(2), mG.substitutePower(27, mN), mN);
    final Polynomial<Z> e = RING.multiply(mG.substitutePower(2), mH.substitutePower(27, mN), mN);
    final Polynomial<Z> f = RING.subtract(d, e.shift(5));

    return RING.multiply(c, f, mN).coeff(mN);
  }
}
