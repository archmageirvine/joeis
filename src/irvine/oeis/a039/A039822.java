package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039822 Number of different coefficient values in expansion of Product_{i=1..n} (1+q^i).
 * @author Sean A. Irvine
 */
public class A039822 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    mProduct = RING.multiply(mProduct, RING.onePlusXToTheN(++mN));
    return Z.valueOf(new TreeSet<>(mProduct).size());
  }
}
