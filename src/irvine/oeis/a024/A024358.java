package irvine.oeis.a024;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024358 Sum of the sizes of binary subtrees of the perfect binary tree of height <code>n</code>.
 * @author Sean A. Irvine
 */
public class A024358 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = RING.one();
      return Z.ONE;
    } else {
      mB = RING.add(RING.one(), RING.pow(mB, 2).shift(1));
    }
    return RING.eval(RING.diff(mB), Z.ONE);
  }
}
