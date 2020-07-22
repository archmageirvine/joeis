package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033910 Numbers n such that <code>s(n)+s(n+1)+s(n+2)=t(n)+t(n+1)+t(n+2)</code> where <code>s(n)=sigma(n)-n, t(n)=|s(n)-n|</code>.
 * @author Sean A. Irvine
 */
public class A033910 implements Sequence {

  private long mN = 0;

  private Z s(final long n) {
    return Cheetah.factor(n).sigma().subtract(n);
  }

  protected long m() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z s = Z.ZERO;
      Z t = Z.ZERO;
      for (int k = 0; k <= m(); ++k) {
        final Z sk = s(mN + k);
        s = s.add(sk);
        t = t.add(sk.subtract(mN + k).abs());
      }
      if (s.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
