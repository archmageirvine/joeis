package irvine.oeis.a035;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.BikTransformSequence;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.Sequence;

/**
 * A035082 Number of rooted polygonal cacti (Husimi graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A035082 implements Sequence {

  // todo broken

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private final Polynomial<Z> mA = RING.create(Collections.emptyList());

  @Override
  public Z next() {
    final int n = mA.size();
    if (n < 2) {
      mA.add(Z.valueOf(n));
    } else if (n == 2) {
      mA.add(Z.ZERO);
    } else {
      final Polynomial<Z> t = RING.subtract(RING.subtract(BikTransformSequence.bik(mA), RING.one()), mA);
      System.out.println(t);
      final Z e = EulerTransformSequence.eulerTransform(t, n);
      mA.add(e);
    }
    return mA.coeff(n);
  }
}
