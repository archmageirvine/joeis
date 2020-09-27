package irvine.oeis.a035;

import java.util.Collections;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.BikTransformSequence;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A035082 Number of rooted polygonal cacti (Husimi graphs) with n nodes.
 * @author Sean A. Irvine
 */
public class A035082 implements Sequence {

  protected static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  protected final Polynomial<Z> mA = RING.create(Collections.emptyList());

  @Override
  public Z next() {
    int n = mA.size();
    if (n < 2) {
      mA.add(Z.valueOf(n));
    } else {
      final Polynomial<Z> t = RING.subtract(RING.subtract(BikTransformSequence.bik(mA), RING.one()), mA);
      final Sequence et = new SkipSequence(new EulerTransformSequence(new FiniteSequence(t), 1, Z.ZERO), n);
      mA.add(et.next());
    }
    return mA.coeff(n);
  }
}
