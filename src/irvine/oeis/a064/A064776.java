package irvine.oeis.a064;

import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064776 a(n) is smallest number &gt;= a(n-1) such that a(n) plus any set of the previous values of the sequence is a nonsquare.
 * @author Sean A. Irvine
 */
public class A064776 extends Sequence1 {

  private final HashSet<Z> mSums = new HashSet<>();
  private long mN = 2;

  private boolean is(final long n) {
    if (LongUtils.isSquare(n)) {
      return false;
    }
    for (final Z v : mSums) {
      if (v.add(n).isSquare()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(mN)) {
        final HashSet<Z> newSums = new HashSet<>();
        for (final Z v : mSums) {
          newSums.add(v.add(mN));
        }
        mSums.addAll(newSums);
        mSums.add(Z.valueOf(mN));
        return Z.valueOf(mN);
      }
      ++mN;
    }
  }
}
