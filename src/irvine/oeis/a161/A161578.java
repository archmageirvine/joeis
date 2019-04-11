package irvine.oeis.a161;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161578 <code>a(1)=2</code>. <code>a(n) =</code> the smallest integer <code>&gt; a(n-1)</code> such that d(a(n)) <code>&lt;=</code> d(n), where d(n) = the number of divisors of n.
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
      final long dn = Cheetah.factor(++mN).sigma0();
      do {
        mPrev = mPrev.add(1);
      } while (Cheetah.factor(mPrev).sigma0() > dn);
    }
    return mPrev;
  }
}

