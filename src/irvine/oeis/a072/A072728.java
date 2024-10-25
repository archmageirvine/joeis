package irvine.oeis.a072;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072728 Numerator of rationals &gt;= 1 whose continued fractions consist only of 1's and 2's, in ascending order by the sum of the continued fraction terms and descending by lowest order continued fraction terms to highest.
 * @author Sean A. Irvine
 */
public class A072728 extends Sequence0 {

  private final TreeSet<List<Z>> mA = new TreeSet<>((a, b) -> {
    final int c = Functions.SUM.z(a).compareTo(Functions.SUM.z(b));
    if (c != 0) {
      return c;
    }
    for (final Iterator<Z> ai = a.iterator(), bi = b.iterator(); ai.hasNext() && bi.hasNext();) {
      final Z av = ai.next();
      final Z bv = bi.next();
      final int d = bv.compareTo(av);
      if (d != 0) {
        return d;
      }
    }
    return 0;
  });

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Collections.singletonList(Z.TWO));
      return select(Q.ONE); // special case, only cfrac ending in 1
    }
    final List<Z> res = mA.pollFirst();
    final List<Z> a = new ArrayList<>();
    a.add(Z.ONE);
    a.addAll(res);
    mA.add(a);
    final List<Z> b = new ArrayList<>();
    b.add(Z.TWO);
    b.addAll(res);
    mA.add(b);
    return select(ContinuedFractionUtils.toQ(res));
  }
}
