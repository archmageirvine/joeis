package irvine.oeis.a057;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a039.A039834;

/**
 * A057596 E.g.f. is 1/E(x) where E(x) is e.g.f. for [1,0,1,1,2,3,5,8,...] with o.g.f. (1-x)/(1-x-x^2).
 * @author Sean A. Irvine
 */
public class A057596 extends AbstractSequence {

  private final A039834 mSeq1 = new A039834();

  /** Construct the sequence. */
  public A057596() {
    super(0);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);

  {
    mSeq1.next();
  }

  private final Polynomial<Q> mE = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mE.add(new Q(mSeq1.next().abs(), MemoryFactorial.SINGLETON.factorial(++mN)));
    return RING.coeff(RING.one(), mE, mN).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}
