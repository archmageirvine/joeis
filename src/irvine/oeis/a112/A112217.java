package irvine.oeis.a112;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003106;
import irvine.oeis.a003.A003114;

/**
 * A112217 McKay-Thompson series of class 93A for the Monster group.
 * @author Sean A. Irvine
 */
public class A112217 implements Sequence {

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

    final Polynomial<Z> a = RING.multiply(mH, mG.substitutePower(31, mN), mN);
    final Polynomial<Z> b = RING.multiply(mG, mH.substitutePower(31, mN), mN);
    final Polynomial<Z> c = RING.subtract(a, b.shift(6));
    return c.coeff(mN);
  }
}

