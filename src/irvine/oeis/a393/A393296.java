package irvine.oeis.a393;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393296 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A393296 extends Sequence0 {

  // After Ludovic Schwob

  private static final class Wrapper {
    private final byte[] mData;

    private Wrapper(final byte[] data) {
      mData = data;
    }

    private byte[] getData() {
      return mData;
    }

    @Override
    public boolean equals(final Object other) {
      return other instanceof Wrapper && Arrays.equals(mData, ((Wrapper) other).mData);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mData);
    }
  }
  
  private Set<Set<Wrapper>> mL = null;

  private static Set<Wrapper> up(final byte[] p) {
    final Set<Wrapper> res = new HashSet<>();
    final int n = p.length;
    // increase existing rows
    for (int k = 0; k < n; ++k) {
      if (k == 0 || p[k] < p[k - 1]) {
        final byte[] q = p.clone();
        ++q[k];
        res.add(new Wrapper(q));
      }
    }
    // add new row of size 1 (can reuse existing list)
    final byte[] q = Arrays.copyOf(p, p.length + 1);
    q[p.length] = 1;
    res.add(new Wrapper(q));
    return res;
  }

  private static boolean containsAllDown(final Set<Wrapper> set, final byte[] p) {
    final int n = p.length;
    for (int i = 0; i < n; ++i) {
      if (i == n - 1 || p[i] > p[i + 1]) {
        final byte[] q;
        if (p[i] != 1) {
          q = p.clone();
          --q[i];
        } else {
          q = new byte[p.length - 1];
          System.arraycopy(p, 0, q, 0, i);
          System.arraycopy(p, i + 1, q, i, p.length - i - 1);
        }
        if (!set.contains(new Wrapper(q))) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mL == null) {
      mL = Collections.emptySet();
      return Z.ONE;
    }
    if (mL.isEmpty()) {
      final Set<Wrapper> base = new HashSet<>();
      base.add(new Wrapper(new byte[0]));
      mL = Collections.singleton(base);
      return Z.ONE;
    }
    final Set<Set<Wrapper>> next = new HashSet<>();
    for (final Set<Wrapper> set : mL) {
      for (final Wrapper xb : set) {
        final byte[] x = xb.getData();
        for (final Wrapper yb : up(x)) {
          final byte[] y = yb.getData();
          if (!set.contains(yb) && containsAllDown(set, y)) {
            final Set<Wrapper> s2 = new HashSet<>(set);
            s2.add(new Wrapper(y));
            next.add(s2);
          }
        }
      }
    }
    mL = next;
    return Z.valueOf(mL.size());
  }
}
