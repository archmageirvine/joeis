package irvine.oeis.a058;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058330 a(n) is smallest positive integer, distinct from any terms earlier in the sequence, such that (sum{k=1 to n}[a(k)]) divides (product{k=1 to n}[a(k)])*(sum{k=1 to n}[1/a(k)]).
 * @author Sean A. Irvine
 */
public class A058330 implements Sequence {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mSum = Z.ZERO;
  private Z mProd = Z.ONE;
  private Q mRecip = Q.ZERO;

  @Override
  public Z next() {
    long n = 0;
    while (true) {
      if (!mUsed.contains(++n)) {
        final Z s = mSum.add(n);
        final Z p = mProd.multiply(n);
        final Q r = mRecip.add(new Q(1, n));
        if (r.multiply(p).toZ().mod(s).isZero()) {
          mSum = s;
          mProd = p;
          mRecip = r;
          mUsed.add(n);
          return Z.valueOf(n);
        }
      }
    }
  }
}
