package irvine.oeis.a006;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006842.
 * @author Sean A. Irvine
 */
public class A006842 implements Sequence {

  private long mN = 0;
  private int mM = 0;
  private final ArrayList<Q> mTerms = new ArrayList<>();

  protected Z select(final Q q) {
    return q.num();
  }

  @Override
  public Z next() {
    if (++mM >= mTerms.size()) {
      ++mN;
      mM = 0;
      mTerms.clear();
      for (long a = 0; a <= mN; ++a) {
        for (long b = a; b <= mN; ++b) {
          if (LongUtils.gcd(a, b) == 1) {
            mTerms.add(new Q(a, b));
          }
        }
      }
      Collections.sort(mTerms);
    }
    return select(mTerms.get(mM));
  }

}
