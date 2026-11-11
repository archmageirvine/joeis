package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087343 Smallest k such that the concatenation of the n numbers k, k-1, k-2, k-3,... k-n+1 (the concatenation of n successive numbers in descending order) is divisible by n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A087343 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = mN - 1;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, t = s; k < mN; ++k, --t) {
        sb.append(t);
      }
      if (new Z(sb).mod(mN) == 0) {
        return Z.valueOf(s);
      }
    }
  }
}

