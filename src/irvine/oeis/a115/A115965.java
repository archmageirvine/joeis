package irvine.oeis.a115;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A115965 Number of planar subpartitions of the size n pyramidal planar partition.
 * @author Sean A. Irvine
 */
public class A115965 extends Sequence0 {

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

  private Map<Key, Z> mD = new HashMap<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A115965() {
    mD.put(new Key(new int[0]), Z.ONE);
  }

  private List<Key> covers(final Key l, final int o) {
    final int n = l.mA.length;
    final int[] l0 = new int[n + 1];
    System.arraycopy(l.mA, 0, l0, 0, n);
    l0[n] = 2 * n + 1;

    List<int[]> lst = new ArrayList<>();
    if (o != 0) {
      final int m = Math.min(1, l0[0]);
      for (int k = 0; k <= m; ++k) {
        lst.add(new int[]{k});
      }
    } else {
      lst.add(new int[0]);
    }

    for (int i = 0; i < n; ++i) {
      final List<int[]> lst2 = new ArrayList<>();
      final int lo = l0[i];
      final int hi = Math.min(2 * (i + 1) + o, l0[i + 1]);
      for (int k = lo; k <= hi; ++k) {
        for (final int[] a : lst) {
          final int[] b = new int[a.length + 1];
          System.arraycopy(a, 0, b, 0, a.length);
          b[a.length] = k;
          lst2.add(b);
        }
      }
      lst = lst2;
    }

    final List<Key> res = new ArrayList<>();
    for (final int[] a : lst) {
      res.add(new Key(a));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Map<Key, Z> d2 = new HashMap<>();
    for (final Map.Entry<Key, Z> e : mD.entrySet()) {
      final Key l = e.getKey();
      final Z v = e.getValue();
      for (final Key t : covers(l, mN % 2)) {
        d2.merge(t, v, Z::add);
      }
    }
    mD = d2;
    Z sum = Z.ZERO;
    for (final Z k : mD.values()) {
      sum = sum.add(k.square());
    }
    return sum;
  }
}
