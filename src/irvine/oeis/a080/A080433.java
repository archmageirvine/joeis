package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080433 a(1) = 2; for n&gt;1, a(n) = smallest multiple of n beginning with the least significant digit of a(n-1) &gt; n and not divisible by 10 if n is not of the type 10k; otherwise a(n) ends in 0 and a(n+1) begins with the first nonzero digit from the right(LSD) of a(n).
 * @author Sean A. Irvine
 */
public class A080433 extends Sequence1 {

  // a(1) = 2; for n>1, a(n) = smallest multiple of n beginning with the least significant digit of a(n-1) > n and not divisible by 10 if n is not of the type 10k; otherwise a(n) ends in 0 and a(n+1) begins with the first nonzero digit from the right(LSD) of a(n).

  private Z mA = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final long r = mA.mod(10);
      long k = mN;
      while (true) {
        k += mN;
        if ((mN % 10 == 0 || k % 10 != 0) && String.valueOf(k).charAt(0) - '0' == r) {
          mA = Z.valueOf(k);
          break;
        }
      }
    }
    return mA;
  }
}

