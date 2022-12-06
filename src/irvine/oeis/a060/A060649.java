package irvine.oeis.a060;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060649 Smallest number k==3 (mod 4) such that Q(sqrt(-k)) has class number n, or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A060649 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = -1;
    while (true) {
      k += 4;
      if (LongUtils.classNumber(-k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
