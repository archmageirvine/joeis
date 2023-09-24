package irvine.oeis.a065;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007305;
import irvine.oeis.a007.A007306;

/**
 * A065934 Permutation of N induced by the order-preserving bijection QuQR1toQuQR2 on rationals.
 * @author Sean A. Irvine
 */
public class A065934 extends A065249 {

  // A007305/A007306 matches Karttunen's SternBrocotTreeNum(m)/SternBrocotTreeDen(m)
  private final Sequence mNum = new A007305().skip(2);
  private final Sequence mDen = new A007306().skip(2);

  private Q q01ToQ(final Q rr) {
    Q r = rr;
    long i = 0;
    while (r.compareTo(Q.HALF) >= 0) {
      r = r.subtract(Q.HALF).multiply(2);
      ++i;
    }
    return r.multiply(2).add(i);
  }

  @Override
  public Z next() {
    final Q a = q01ToQ(new Q(mNum.next(), mDen.next()));
    while (mOrdering.get(a) == null) {
      stepSternBrocot();
    }
    return Z.valueOf(mOrdering.remove(a));
  }
}
