package irvine.oeis.a035;

import java.util.Iterator;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035485 Card on top of deck at n-th stage of R. K. Guy's shuffling problem.
 * @author Sean A. Irvine
 */
public class A035485 implements Sequence {

  // This works by keeping track of the initial part of the deck which is
  // different from ordered integers.  Once the end of the list is
  // reached can assume remainder is integers in order.

  protected LinkedList<Long> mDeck = new LinkedList<>();
  {
    mDeck.add(1L);
  }
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final LinkedList<Long> next = new LinkedList<>();
    long m = 0;
    final Iterator<Long> existing = mDeck.iterator();
    if (mN >= mDeck.size()) {
      m = mDeck.size();
    } else {
      while (++m < mN) {
        existing.next(); // skip over the first part of the list
      }
    }
    final Iterator<Long> top = mDeck.iterator();
    for (int k = 0; k < mN; ++k) {
      next.add(m >= mDeck.size() ? m : existing.next());
      ++m;
      next.add(top.next());
    }
    mDeck = next;
    return Z.valueOf(mDeck.peekFirst());
  }
}

