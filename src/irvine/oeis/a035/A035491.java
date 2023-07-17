package irvine.oeis.a035;

import java.util.Iterator;

import irvine.math.z.Z;

/**
 * A035491 Relevant part of deck in Guy's shuffling problem (A035485): row n of the table lists the first 2n "cards" (numbers) after the n-th shuffle.
 * @author Sean A. Irvine
 */
public class A035491 extends A035485 {

  /** Construct the sequence. */
  public A035491() {
    super(1);
  }

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

