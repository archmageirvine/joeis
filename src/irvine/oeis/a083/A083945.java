package irvine.oeis.a083;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083945 Least integer coefficients of A(x), where 1&lt;=a(n)&lt;=5, such that A(x)^(1/5) consists entirely of integer coefficients.
 * @author Sean A. Irvine
 */
public class A083945 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Q mRoot;
  private final ArrayList<Q> mA = new ArrayList<>();

  protected A083945(final int root) {
    mRoot = new Q(1, root);
  }

  /** Construct the sequence. */
  public A083945() {
    this(5);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    final int n = mA.size();
    long k = 1;
    mA.add(n, Q.ONE);
    while (true) {
      final Series<Q> s = SQ.powE(SQ.create(mA), mRoot);
      boolean ok = true;
      for (int j = n; j >= 0; --j) {
        if (!s.coeff(j).isInteger()) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(k);
      }
      mA.set(n, Q.valueOf(++k));
    }
  }
}
