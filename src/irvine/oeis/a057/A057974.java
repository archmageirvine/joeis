package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a035.A035485;

/**
 * A057974 Deepest position in the deck reached by card 1 before returning to the top in the shuffle in A035485 and A035499.
 * @author Sean A. Irvine
 */
public class A057974 extends A035485 {

  {
    next();
  }

  @Override
  public Z next() {
    long deepest = 0;
    do {
      super.next();
      long k = 0;
      for (final long v : mDeck) {
        ++k;
        if (v == 1) {
          if (k > deepest) {
            deepest = k;
          }
          break;
        }
      }
    } while (mDeck.peekFirst() != 1);
    return Z.valueOf(deepest);
  }
}
