package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065191 Limit of the recursion B_[k] = T[k](B_[k-1]), where B_[1] = (1,2,3,4,5,...) and T[k] is the transformation that permutes the entries k(2i-1) + j and k(2i) + j for all j = 0,..,k-1 and positive integers i.
 * @author Sean A. Irvine
 */
public class A065191 extends Sequence1 {

  // After Charlie Neder

  protected long mN = 0;

  private long divsign(final long s, final long k) {
    return ((s / k) & 1) == 0 ? k : -k;
  }

  @Override
  public Z next() {
    long s = ++mN;
    for (long k = mN; k > 1; --k) {
      s -= divsign(s, k);
    }
    return Z.valueOf(s);
  }
}
