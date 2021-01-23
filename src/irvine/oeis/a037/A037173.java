package irvine.oeis.a037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A037173 Numbers that are not the sum of consecutive composite numbers.
 * @author Sean A. Irvine
 */
public class A037173 extends A002808 {

  private List<Z> mPartialSums = Collections.emptyList();
  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mNext = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(mNext.divide2()) >= 0) {
        final List<Z> ps = new ArrayList<>();
        for (final Z s : mPartialSums) {
          final Z t = s.add(mNext);
          ps.add(t);
          mForbidden.add(t);
        }
        ps.add(mNext);
        mPartialSums = ps;
        mNext = super.next();
      }
      if (!mForbidden.remove(mN)) {
        return mN;
      }
    }
  }
}
