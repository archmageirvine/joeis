package irvine.oeis.a014;

import java.util.TreeSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014665 Number of new fractions m/n &lt; 1, where (m,n)=1 and "new" means the value of mn has not occurred before.
 * @author Sean A. Irvine
 */
public class A014665 implements Sequence {

  private final TreeSet<Z> mSeen = new TreeSet<>();
  private long mDen = 0;

  @Override
  public Z next() {
    if (++mDen == 1) {
      mSeen.add(Z.ONE);
      return Z.ONE;
    }
    long c = 0;
    for (long k = 1; k < mDen; ++k) {
      final Q q = new Q(k, mDen);
      if (q.den().longValue() == mDen && mSeen.add(q.den().multiply(q.num()))) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

