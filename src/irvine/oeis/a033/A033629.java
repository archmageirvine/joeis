package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002858;

/**
 * A033629 Numbers that are not the sum of two distinct Ulam numbers.
 * @author Sean A. Irvine
 */
public class A033629 implements Sequence {

  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private final MemorySequence mUlam = MemorySequence.cachedSequence(new A002858());
  private Z mU = mUlam.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(mU) >= 0) {
        for (final Z t : mUlam) {
          if (!t.equals(mU)) {
            mForbidden.add(t.add(mU));
          }
        }
        mForbidden.add(mU); // either 0 is supposed to be a Ulam or it means up to 2 numbers in the sum
        mU = mUlam.next();
      }
      if (!mForbidden.remove(mN)) {
        return mN;
      }
    }
  }
}
