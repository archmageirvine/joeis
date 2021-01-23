package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024915 Number of positions in which 2n semi-queens may be placed on an 2n X 2n toroidal board, with only one semi-queen attacking another semi-queen; also, number of interval method wirings for a cryptographic rotor of size 2n.
 * @author Sean A. Irvine
 */
public class A024915 implements Sequence {

  // A technique for doing this search is described at
  // http://web.archive.org/web/20041212165407/http://home.ecn.ab.ca/~jsavard/crypto/ro020302.htm

  // This follows that description to a certain extent.  Essentially we are looking for
  // permutations of [0..n] such that all possible differences pi(i)-i occur.  But because
  // we have an even number of elements this cannot be achieved exactly.  Exactly one
  // difference must be repeated and one must be omitted.  We force 0 -> 0, and force the
  // 0 to be the difference that is repeated.  Then the search is somewhat reduced and we
  // can multiply up to cover the other cases.

  // There is probably a much smarter way of generating this sequence ...

  private long mN = 0;
  private long mCount = 0;

  private void search(final int pos, final long used, final long usedDeltas) {
    if (pos == mN) {
      ++mCount;
      return;
    }
    for (int k = 1; k < mN; ++k) { // start at 1 since we always use 0 first
      if ((used & (1L << k)) == 0) {
        int delta = k - pos;
        if (delta < 0) {
          delta += mN;
        }
        if ((usedDeltas & (1L << delta)) == 0) {
          search(pos + 1, used | (1L << k), usedDeltas | (1L << delta));
        }
      }
    }
  }

  @Override
  public Z next() {
    mN += 2;
    if (mN >= 64) {
      throw new UnsupportedOperationException();
    }
    mCount = 0;
    search(1, 1, 0); // pretend we have not used delta=0 (even though we already did)
    return Z.valueOf(mCount).multiply(mN).multiply(mN / 2);
  }
}
