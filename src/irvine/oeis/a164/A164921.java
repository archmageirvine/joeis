package irvine.oeis.a164;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A164921 a(1)=0, a(2)=1. For n &gt;=3, a(n) = the smallest integer &gt; a(n-1) that is coprime to every sum of any two distinct earlier terms of this sequence.
 * @author Sean A. Irvine
 */
public class A164921 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private final LongDynamicLongArray mS = new LongDynamicLongArray();

  @Override
  public Z next() {
    if (mA.length() == 0) {
      mA.set(0, 0L);
      return Z.ZERO;
    }
    long n = mA.get(mA.length() - 1) + 1;
    while (true) {
      boolean ok = true;
      for (long p = 0; p < mS.length(); ++p) {
        if (Functions.GCD.l(mS.get(p), n) != 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        for (long k = 0, t = mS.length(); k < mA.length(); ++k, ++t) {
          mS.set(t, n + mA.get(k));
        }
        mA.set(mA.length(), n);
        return Z.valueOf(n);
      }
      ++n;
    }
  }
}

