package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035492 Position of card 1 after n-th shuffle in Guy's shuffling problem (A035485).
 * @author Sean A. Irvine
 */
public class A035492 extends A035485 {

  @Override
  public Z next() {
    super.next();
    long c = 0;
    for (final long t : mDeck) {
      ++c;
      if (t == 1) {
        return Z.valueOf(c);
      }
    }
    throw new RuntimeException();
  }
}

