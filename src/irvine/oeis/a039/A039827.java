package irvine.oeis.a039;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039827 Number of different coefficient values in expansion of Product (1+q^i+q^(2i)), i=1 to n.
 * @author Sean A. Irvine
 */
public class A039827 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProduct = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    final Z[] t = new Z[2 * ++mN + 1];
    Arrays.fill(t, Z.ZERO);
    t[0] = Z.ONE;
    t[mN] = Z.ONE;
    t[2 * mN] = Z.ONE;
    mProduct = RING.multiply(mProduct, Polynomial.create(t));
    return Z.valueOf(new TreeSet<>(mProduct).size());
  }
}
