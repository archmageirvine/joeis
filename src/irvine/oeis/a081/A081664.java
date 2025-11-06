package irvine.oeis.a081;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A081664 For the smallest q for which there exists a fraction p/q containing n in its decimal expansion, this sequence gives the smallest p.
 * @author Sean A. Irvine
 */
public class A081664 extends Sequence1 implements Conjectural {

  // 100 below is heuristic
  private static final CR SCALE = CR.valueOf(Z.TEN.pow(100));
  private long mN = 0;

  protected Z select(final long p, final long q) {
    return Z.valueOf(p);
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    long q = 0;
    while (true) {
      ++q;
      for (long p = 1; p <= q; ++p) {
        if (CR.valueOf(new Q(p, q)).multiply(SCALE).floor().toString().contains(s)) {
          return select(p, q);
        }
      }
    }
  }
}
