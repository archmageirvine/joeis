package irvine.oeis.a083;

import java.util.ArrayList;

import irvine.math.q.Q;
import irvine.math.series.Series;
import irvine.math.series.SeriesRing;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083951 Least increasing integer coefficients such that A(x)^(1/3) has only integer coefficients.
 * @author Sean A. Irvine
 */
public class A083951 extends Sequence0 {

  private static final SeriesRing<Q> SQ = SeriesRing.SQ;
  private final Q mRoot;
  private final ArrayList<Q> mA = new ArrayList<>();

  protected A083951(final int root) {
    mRoot = new Q(1, root);
  }

  /** Construct the sequence. */
  public A083951() {
    this(3);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ONE);
      return Z.ONE;
    }
    final int n = mA.size();
    long k = mA.get(n - 1).toZ().longValueExact() + 1;
    mA.add(n, Q.valueOf(k));
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
