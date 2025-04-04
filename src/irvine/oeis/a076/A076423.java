package irvine.oeis.a076;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076423 Number of iterations of the mapping k -&gt; abs(reverse(lpd(k))-reverse(gpf(k))) to reach zero, or -1 if zero is never reached. lpd(k) is the largest proper divisor and gpf(k) is the greatest prime factor of k.
 * @author Sean A. Irvine
 */
public class A076423 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final HashSet<Z> mSeen = new HashSet<>();
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.isZero()) {
      m = Functions.REVERSE.z(m.divide(Functions.LPF.z(m))).subtract(Functions.REVERSE.z(Functions.GPF.z(m))).abs();
      if (!mSeen.add(m)) {
        return Z.NEG_ONE;
      }
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
