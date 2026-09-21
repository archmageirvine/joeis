package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086566 a(1)=2; for n&gt;1, a(n) is the largest prime number m such that a(n-1)^(1/(n-1)) &gt; m^(1/n).
 * @author Sean A. Irvine
 */
public class A086566 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.TWO;

  @Override
  public Z next() {
    if (++mN > 1) {
      Z p = mA;
      final CR lo = CR.valueOf(new Q(1, mN - 1));
      final CR hi = CR.valueOf(new Q(1, mN));
      while (true) {
         final Z q = p;
         p = Functions.NEXT_PRIME.z(p);
         if (CR.valueOf(mA).pow(lo).compareTo(CR.valueOf(p).pow(hi)) <= 0) {
           mA = q;
           break;
         }
      }
    }
    return mA;
  }
}

