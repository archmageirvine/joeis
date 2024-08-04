package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071687 Non-palindromic numbers such that either x=q1.Rev[x] or Rev[x]=q2.x, where R[x]=A004086[x] and q1 or q2 are integers not divisible by 10.
 * @author Sean A. Irvine
 */
public class A071687 extends Sequence1 {

  private long mN = 509;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.REVERSE.l(++mN);
      if (r != mN) {
        if (r % mN == 0) {
          final long t = r / mN;
          if (t % 10 != 0) {
            return Z.valueOf(mN);
          }
        }
        if (mN % r == 0) {
          final long t = mN / r;
          if (t % 10 != 0) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
