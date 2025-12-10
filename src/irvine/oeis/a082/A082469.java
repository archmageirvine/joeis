package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082469 If n==1 or mod(n,2)==0 or mod(n,5)==0 then -1, otherwise a(n) is the smallest nonnegative integer k such that the concatenation 1(k)2(k)3(k)...(k)n is a prime.
 * @author Sean A. Irvine
 */
public class A082469 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || (mN & 1) == 0 || mN % 5 == 0) {
      return Z.NEG_ONE;
    }
    long k = 0;
    while (true) {
      ++k;
      final StringBuilder sb = new StringBuilder();
      for (long j = 1; j < mN; ++j) {
        sb.append(j).append(k);
      }
      if (new Z(sb.append(mN)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

