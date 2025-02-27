package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a014.A014574;
import irvine.util.array.DynamicArray;

/**
 * A075591 Smallest squarefree number with n prime divisors which is the average of a twin prime pair.
 * @author Sean A. Irvine
 */
public class A075591 extends A014574 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 1;
  {
    setOffset(2);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      if (fs.isSquareFree()) {
        final int omega = fs.omega();
        if (mFirsts.get(omega) == null) {
          mFirsts.set(omega, t);
        }
      }
    }
    return mFirsts.get(mN);
  }
}

