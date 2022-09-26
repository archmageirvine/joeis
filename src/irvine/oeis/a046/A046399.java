package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a002.A002113;
import irvine.util.array.LongDynamicArray;

/**
 * A046399 Smallest squarefree palindrome with exactly n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A046399 extends A002113 {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private long mN = -1;

  {
    super.next(); // skip 0
  }

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z t = super.next();
      final FactorSequence fs = Jaguar.factor(t);
      final long omega = fs.bigOmega();
      if (mA.get(omega) == null && omega == fs.omega()) {
        mA.set(omega, t);
      }
    }
    return mA.get(mN);
  }
}
