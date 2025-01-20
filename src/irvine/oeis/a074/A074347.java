package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A074347 Smallest number requiring n steps to reach 0 when iterating the function: f(n)=abs(lpd(n)-Lpf(n)), where lpd(n) is the largest proper divisor of n and Lpf(n) is the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074347 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      long cnt = 0;
      long m = ++mM;
      while (m != 0) {
        m = Math.abs(m / Functions.LPF.l(m) - Functions.GPF.l(m));
        ++cnt;
      }
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
