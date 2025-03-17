package irvine.oeis.a076;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076053 Rearrangement of natural numbers such that the 2n-th partial sum is composite and (2n-1)-th partial sum is prime.
 * @author Sean A. Irvine
 */
public class A076053 extends Sequence1 {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private boolean mOdd = false;
  private Z mSum = Z.ZERO;
  private long mS = 1; // least unused number

  @Override
  public Z next() {
    mOdd = !mOdd;
    long k = mS;
    while (true) {
      final Z t = mSum.add(k);
      if (t.isProbablePrime() == mOdd && mUsed.add(k)) {
        mSum = t;
        while (mUsed.remove(mS)) {
          ++mS;
        }
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
