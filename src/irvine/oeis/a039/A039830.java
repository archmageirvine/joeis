package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039830.
 * @author Sean A. Irvine
 */
public class A039830 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private final Polynomial<Z> mT = RING.empty();
  {
    mT.add(Z.ONE);
  }
  private int mN = 0;

  @Override
  public Z next() {
    mT.add((++mN & 1) == 0 ? Z.ONE : Z.NEG_ONE);
    mProduct = RING.multiply(mProduct, mT);
    return Z.valueOf(new TreeSet<>(mProduct).size());
  }
}
