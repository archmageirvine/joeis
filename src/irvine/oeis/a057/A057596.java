package irvine.oeis.a057;

<<<<<<< Updated upstream
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a039.A039834;

/**
 * A057596 E.g.f. is 1/E(x) where E(x) is e.g.f. for [1,0,1,1,2,3,5,8,...] with o.g.f. (1-x)/(1-x-x^2).
 * @author Sean A. Irvine
 */
public class A057596 extends A039834 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  {
    super.next();
  }
  private final Polynomial<Q> mE = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mE.add(new Q(super.next().abs(), MemoryFactorial.SINGLETON.factorial(++mN)));
    return RING.coeff(RING.one(), mE, mN).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
=======
import irvine.math.z.Z;

/**
 * A057593.
 * @author Sean A. Irvine
 */
public class A057595 extends A057593 {

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
    return Z.valueOf((2 * t(mN, mM == mN ? 1 : mM)) % (mN - 1));
>>>>>>> Stashed changes
  }
}
