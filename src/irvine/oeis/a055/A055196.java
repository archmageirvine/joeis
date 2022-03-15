package irvine.oeis.a055;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a011.A011775;

/**
 * A055196 Primitive numbers k that divide sigma(k)*phi(k).
 * @author Sean A. Irvine
 */
public class A055196 extends A011775 {

  private final TreeSet<Z> mPrimitive = new TreeSet<>();
  {
    super.next();
  }

  private boolean isPrimitive(final Z t) {
    for (final Z d : Cheetah.factor(t).divisors()) {
      if (mPrimitive.contains(d)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (isPrimitive(t)) {
        mPrimitive.add(t);
        return t;
      }
    }
  }
}
