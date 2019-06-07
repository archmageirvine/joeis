package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161578 <code>a(1)=2. a(n) =</code> the smallest integer <code>&gt; a(n-1)</code> such that <code>d(a(n)) &lt;= d(n)</code>, where <code>d(n) =</code> the number of divisors of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A161578 implements Sequence {

  private long mN = 1;
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.TWO;
    } else {
      final long dn = Cheetah.factor(++mN).sigma0AsLong();
      do {
        mPrev = mPrev.add(1);
      } while (Cheetah.factor(mPrev).sigma0AsLong() > dn);
    }
    return mPrev;
  }
}

