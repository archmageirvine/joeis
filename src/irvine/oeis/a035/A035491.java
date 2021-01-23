package irvine.oeis.a035;

import java.util.Iterator;

import irvine.math.z.Z;

/**
 * A035491 Relevant part of deck in Guy's shuffling problem (A035485), regarded as a triangular array.
 * @author Sean A. Irvine
 */
public class A035491 extends A035485 {

  private int mN = 1;
  private Iterator<Long> mIterator = null;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mN >= mDeck.size()) {
      super.next();
      mIterator = mDeck.iterator();
      mN = 2;
    }
    return Z.valueOf(mIterator.next());
  }
}

