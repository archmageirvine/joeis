package irvine.oeis.a085;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085098 a(n) = number of solutions (x_1, x_2, ..., x_n) to Product_{i=1..n} (1 + 1/x_i) = 2.
 * @author Sean A. Irvine
 */
public class A085098 extends Sequence1 {

  // After David Canright

  private int mN = 0;

  private final HashMap<String, List<List<Q>>> mCache = new HashMap<>();

  private List<List<Q>> spl(final Q r, final int n) {
    final String key = r + "," + n;
    final List<List<Q>> res = mCache.get(key);
    if (res != null) {
      return res;
    }
    if (n == 1) {
      if (r.num().equals(r.den().add(1))) {
        return Collections.singletonList(Collections.singletonList(r));
      }
      return Collections.emptyList();
    }
    List<List<Q>> s = new ArrayList<>();
    Q q;
    for (Z i = Q.ONE.divide(r.subtract(1)).floor().add(1); (q = new Q(i.add(1), i)).pow(n).compareTo(r) >= 0; i = i.add(1)) {
      final List<List<Q>> l = spl(r.divide(q), n - 1);
      for (final List<Q> qs : l) {
        if (qs.get(0).compareTo(q) <= 0) {
          final ArrayList<Q> lst = new ArrayList<>();
          lst.add(q);
          lst.addAll(qs);
          s.add(lst);
        }
      }
    }
    mCache.put(key, s);
    return s;
  }


  private Z spCount(final int r, final int n) {
    return Z.valueOf(spl(Q.valueOf(r), n).size());
  }

  @Override
  public Z next() {
    return spCount(2, ++mN);
  }
}

