package irvine.oeis.a032;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;

/**
 * A032178 Functions of n points with no fixed points and with no symmetries.
 * @author Sean A. Irvine
 */
public class A032178 implements Sequence {

  // WEIGH transform (actually weighout in Maple transforms)

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final MemorySequence mA = MemorySequence.cachedSequence(new PrependSequence(new A032177(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.powz(RING.onePlusXToTheN(k), mA.a(k), mN), mN);
    }
    return prod.coeff(mN);
  }
}
