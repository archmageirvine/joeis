package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082449 Let f(p) = greatest prime divisor of p-1. Sequence gives smallest prime which takes at least n steps to reach 2 when f is iterated.
 * @author Sean A. Irvine
 */
public class A082449 extends Sequence0 {

  private int mN = -1;
  private long mP = 2;

  private int count(long n) {
    int cnt = 0;
    while (n != 2) {
      ++cnt;
      n = Functions.GPF.l(n - 1);
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (count(mP) >= mN) {
        return Z.valueOf(mP);
      }
      mP = Functions.NEXT_PRIME.l(mP);
    }
  }
}

