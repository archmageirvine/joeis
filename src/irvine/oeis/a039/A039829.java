package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039829.
 * @author Sean A. Irvine
 */
public class A039829 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mProduct = RING.multiply(mProduct, (mN & 1) == 0 ? RING.onePlusXToTheN(mN) : RING.oneMinusXToTheN(mN));
    return Z.valueOf(new TreeSet<>(mProduct).size());
  }
}
