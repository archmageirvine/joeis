package irvine.oeis.a066;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066512 Least nonnegative integer not the sum or product of any previous pair. a(1)=0.
 * @author Sean A. Irvine
 */
public class A066512 extends Sequence1 {

  private final HashSet<Z> mTerms = new HashSet<>();
  private final TreeSet<Z> mForbidden = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      if (mForbidden.remove(mN)) {
        mN = mN.add(1);
      } else {
        final HashSet<Z> f = new HashSet<>();
        for (final Z t : mTerms) {
          f.add(t.add(mN));
          if (!t.isZero()) {
            f.add(t.multiply(mN));
          }
        }
        mForbidden.addAll(f);
        mTerms.add(mN);
        return mN;
      }
    }
  }
}
