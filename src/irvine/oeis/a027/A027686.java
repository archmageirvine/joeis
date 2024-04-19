package irvine.oeis.a027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027686 Number of ways to transform say (((((((ab)c)d)e)f)g)h) to (a(b(c(d(e(f(gh))))))) where there are n multiplications (hence n+1 variables) by repeatedly applying the one-way associative law ((xy)z) -&gt; (x(yz)).
 * @author Sean A. Irvine
 */
public class A027686 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;

  private List<Object> s(final int n) {
    return n == 0 ? Collections.emptyList() : Arrays.asList(s(n - 1), Collections.emptyList());
  }

  @SuppressWarnings("unchecked")
  private boolean f(final List<Object> l) {
    return l.isEmpty() || (((List<Object>) l.get(0)).isEmpty() && f((List<Object>) l.get(1)));
  }

  @SuppressWarnings("unchecked")
  private List<Object> v(final List<Object> l) {
    if (f(l)) {
      return Collections.emptyList();
    }
    final ArrayList<Object> r = new ArrayList<>();
    final List<Object> l1 = (List<Object>) l.get(0);
    if (!l1.isEmpty()) {
      r.add(Arrays.asList(l1.get(0), Arrays.asList(l1.get(1), l.get(1))));
    }
    final List<Object> l2 = (List<Object>) l.get(1);
    for (final Object w : v(l1)) {
      final List<Object> g = Arrays.asList(w, l2);
      r.add(g);
    }
    for (final Object w : v(l2)) {
      final List<Object> g = Arrays.asList(l1, w);
      r.add(g);
    }
    return r;
  }

  private final Map<String, Z> mCache = new HashMap<>();

  @SuppressWarnings("unchecked")
  private Z p(final List<Object> l) {
    final String key = l.toString();
    final Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    if (f(l)) {
      mCache.put(key, Z.ONE);
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Object w : v(l)) {
      sum = sum.add(p((List<Object>) w));
    }
    mCache.put(key, sum);
    return sum;
  }

  @Override
  public Z next() {
    return p(s(++mN));
  }
}
