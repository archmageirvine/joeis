package irvine.oeis.a045;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.RationalUnityExtension;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045976 A product related to n-th roots of 1.
 * @author Sean A. Irvine
 */
public class A045976 implements Sequence {

  // todo not working


  private int mN = 0;

  @Override
  public Z next() {
    final RationalUnityExtension ring = new RationalUnityExtension(++mN);
    Polynomial<Q> prod = ring.one();
    for (int j = 1; j < mN; ++j) {
      prod = ring.multiply(prod, ring.add(ring.pow(ring.onePlusXToTheN(j), mN), ring.one()));
    }
    System.out.println(prod);
    return prod.coeff(0).toZ();
  }
}
