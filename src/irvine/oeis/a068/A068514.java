package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068514 Numbers of the form (2i)! (2j)! / i! j! (i + j)!.
 * @author Sean A. Irvine
 */
public class A068514 extends Sequence1 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;
  private Z mLim = Z.ONE;
  {
    mA.add(Z.ONE);
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mLim) >= 0) {
      final Z t = F.factorial(2 * mN).divide(F.factorial(mN));
      for (int k = 1; k <= mN; ++k) {
        mA.add(t.multiply(F.factorial(2 * k).divide(F.factorial(k))).divide(F.factorial(mN + k)));
      }
      final int m = (++mN + 2) / 3;
      mLim = F.factorial(2 * mN).divide(F.factorial(mN)).multiply(F.factorial(2 * m).divide(F.factorial(m))).divide(F.factorial(mN + m));
    }
    return mA.pollFirst();
  }
}

