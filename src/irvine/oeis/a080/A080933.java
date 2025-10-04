package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005282;

/**
 * A080933 Smallest non-occurring pairwise difference between the elements of a Mian-Chowla sequence (A005282) variant starting with (1,n).
 * @author Sean A. Irvine
 */
public class A080933 extends Sequence2 implements Conjectural {

  // todo this suggests some existing values in the OEIS are wrong!

  private static final long HEURISTIC = 100000;
  private long mN = 1;

  @Override
  public Z next() {
    final Z v = Z.valueOf(++mN);
    final A005282 s = new A005282(Z.ONE, v);
    final HashSet<Z> diffs = new HashSet<>();
    Z a = v;
    while (diffs.size() < HEURISTIC) {
      final Z t = s.next();
      for (final Z u : s) {
        final Z diff = t.subtract(u);
        diffs.add(diff);
      }
    }
    do {
      a = a.add(1);
    } while (diffs.contains(a));
    return a;
  }
}

