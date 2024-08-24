package irvine.oeis.a071;

import java.util.Iterator;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071926.
 * @author Sean A. Irvine
 */
public class A071970 extends Sequence1 {

  private final Iterator<Q> mIt = Rationals.SINGLETON.iterator();
  {
    mIt.next();
  }

  @Override
  public Z next() {
    final Q t = mIt.next();
    Z prod = Z.ONE;
    final FactorSequence fsNum = Jaguar.factor(t.num());
    for (final Z p : fsNum.toZArray()) {
      prod = prod.multiply(p.pow(2L * fsNum.getExponent(p)));
    }
    final FactorSequence fsDen = Jaguar.factor(t.den());
    for (final Z p : fsDen.toZArray()) {
      prod = prod.multiply(p.pow(2L * fsDen.getExponent(p) - 1));
    }
    return prod;
  }
}
