package irvine.oeis.a393;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393748 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A393748 extends Sequence0 {

  // After Ludovic Schwob

  private int mN = -1;

  private static final class Key {
    private final int[] mA;

    private Key(final int[] a) {
      mA = a;
    }

    @Override
    public boolean equals(final Object o) {
      if (!(o instanceof Key)) {
        return false;
      }
      return Arrays.equals(mA, ((Key) o).mA);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mA);
    }
  }

  private List<int[]> covers(final int[] l0, final int n, final int k) {
    List<int[]> lst = new ArrayList<>();
    lst.add(new int[0]);

    final int maxI = Math.min(k, (n - k - 1) / 2);
    for (int i = 0; i <= maxI; ++i) {
      final List<int[]> lst2 = new ArrayList<>();
      int b;
      if (i < l0.length && l0[i] < k - i) {
        b = l0[i];
      } else {
        b = k - i + 1;
      }
      b = Math.min(b, n - k - 2 * i);

      for (final int[] l : lst) {
        final int b2;
        if (i > 0) {
          if (l[i - 1] > 0) {
            b2 = Math.min(l[i - 1] - 1, b);
          } else {
            b2 = 0;
          }
        } else {
          b2 = b;
        }
        for (int j = 0; j <= b2; ++j) {
          final int[] l2 = Arrays.copyOf(l, l.length + 1);
          l2[l.length] = j;
          lst2.add(l2);
        }
      }
      lst = lst2;
    }
    return lst;
  }

  @Override
  public Z next() {
    ++mN;
    Map<Key, Z> d = new HashMap<>();
    d.put(new Key(new int[0]), Z.ONE);
    for (int k = 0; k < mN; ++k) {
      final Map<Key, Z> d2 = new HashMap<>();
      for (final Map.Entry<Key, Z> e : d.entrySet()) {
        final int[] l = e.getKey().mA;
        final Z count = e.getValue();
        for (final int[] t : covers(l, mN, k)) {
          final Key key = new Key(t);
          d2.merge(key, count, Z::add);
        }
      }
      d = d2;
    }
    Z sum = Z.ZERO;
    for (final Z v : d.values()) {
      sum = sum.add(v);
    }
    return sum;
  }
}
