package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002420;

import java.util.ArrayList;

/**
 * A000473.
 * @author Sean A. Irvine
 */
public class A000473 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> M0 = Polynomial.create(0, 27, -20, -16);
  private static final Polynomial<Z> M1 = Polynomial.create(0, -27, -20);
  private int mN = 1;
  private final ArrayList<Z> mSqrtCoeffs = new ArrayList<>();
  private final A002420 mSqrtSeq = new A002420();
  {
    mSqrtCoeffs.add(mSqrtSeq.next());
    mSqrtCoeffs.add(mSqrtSeq.next());
    mSqrtCoeffs.add(mSqrtSeq.next());
  }

  @Override
  public Z next() {
    mSqrtCoeffs.add(mSqrtSeq.next());
    final Polynomial<Z> sqrt = RING.create(mSqrtCoeffs);
    ++mN;
    return RING.coeff(RING.add(M0, RING.multiply(sqrt, M1, mN)), RING.pow(sqrt, 11, mN), mN);
  }
}
