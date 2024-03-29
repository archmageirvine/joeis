package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039830 Number of different coefficient values in expansion of Product_{i=1..n} (1-q^1+q^2-...+(-q)^i).
 * @author Sean A. Irvine
 */
public class A039830 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private final Polynomial<Z> mT = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    mT.add((++mN & 1) == 0 ? Z.ONE : Z.NEG_ONE);
    mProduct = RING.multiply(mProduct, mT);
    return Z.valueOf(new TreeSet<>(mProduct).size());
  }
}
