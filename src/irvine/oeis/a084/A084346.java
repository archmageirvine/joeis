package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A084346 Triangle read by rows in which row n gives decomposition of Fib(n)*Fib(n+1) into non-adjacent Fibonacci numbers (given by their indices).
 * @author Sean A. Irvine
 */
public class A084346 extends Sequence1 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (2 * ++mM >= mN) {
      if ((++mN & 1) == 1) {
        mA.set(mN / 2, 2);
      }
      mM = 0;
    }
    final long res = mA.get(mM);
    mA.set(mM, (res + 1) | 1);
    return Z.valueOf(res);
  }
}
