package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071788 Integer quotients arising in A071687.
 * @author Sean A. Irvine
 */
public class A071788 extends Sequence1 {

  private long mN = 509;

  @Override
  public Z next() {
    while (true) {
      final long r = Functions.REVERSE.l(++mN);
      if (r != mN) {
        if (r % mN == 0) {
          final long t = r / mN;
          if (t % 10 != 0) {
            return Z.valueOf(t);
          }
        }
        if (mN % r == 0) {
          final long t = mN / r;
          if (t % 10 != 0) {
            return Z.valueOf(t);
          }
        }
      }
    }
  }
}
