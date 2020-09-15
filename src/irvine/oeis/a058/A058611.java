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
 * A058611 McKay-Thompson series of class 29A for Monster.
 * @author Sean A. Irvine
 */
public class A058611 implements Sequence {

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
    final Polynomial<Z> g = RING.multiply(mG, mG.substitutePower(29, mN), mN);
    final Polynomial<Z> h = RING.multiply(mH, mH.substitutePower(29, mN), mN);
    final Polynomial<Z> a = RING.pow(RING.add(g, h.shift(6)), 2, mN);
    return a.coeff(mN);
  }
}
