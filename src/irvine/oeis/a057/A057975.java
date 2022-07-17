package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a035.A035485;

/**
 * A057975 Record depths reached by card 1 in the shuffle in A035485.
 * @author Sean A. Irvine
 */
public class A057975 extends A035485 {

  private long mDeepest = 0;
  {
    next();
  }

  @Override
  public Z next() {
    while (true) {
      super.next();
      long k = 0;
      for (final long v : mDeck) {
        ++k;
        if (v == 1) {
          if (k > mDeepest) {
            mDeepest = k;
            return Z.valueOf(mDeepest);
          }
          break;
        }
      }
    }
  }
}
