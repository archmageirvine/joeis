package irvine.oeis.a000;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A000226 Number of n-node unlabeled connected graphs with one cycle of length 3.
 * @author Sean A. Irvine
 */
public class A000226 extends A000081 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private Polynomial<Q> mR;
  private final CycleIndex mZS3 = SymmetricGroup.create(3).cycleIndex();

  /** Construct the sequence. */
  public A000226() {
    setOffset(3);
    mR = RING.create(Arrays.asList(new Q(super.next()), new Q(super.next()), new Q(super.next()), new Q(super.next())));
  }

  @Override
  public Z next() {
    final int n = size();
    mR = RING.add(mR, RING.monomial(new Q(super.next()), n));
    return mZS3.apply(mR, n - 1).coeff(n - 1).toZ();
  }
}

