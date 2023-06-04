package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061196 If n = Sum_{i} c_i * 10^i then let b(n) = Sum_{i} c_i * (i+1). Order the integers by b(n) and then n.
 * @author Sean A. Irvine
 */
public class A061196 extends Sequence0 {

  private long mN = -1;
  private long mLim = 1;
  private final List<Long> mA = new ArrayList<>();
  private int mM = 0;

  // If n=sum(c_i*10^i) then let b(n)=sum(c_i*(i+1)). Order the integers by b(n) and then n.

  final long b(long n) {
    long sum = 0;
    int k = 0;
    while (n != 0) {
      sum += (n % 10) * ++k;
      n /= 10;
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mA.clear();
      for (long k = mN; k <= mLim; ++k) {
        if (b(k) == mN) {
          mA.add(k);
        }
      }
      mLim *= 10;
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}
