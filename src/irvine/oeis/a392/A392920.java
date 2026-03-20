package irvine.oeis.a392;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392920 allocated for Ludovic Schwob.
 * @author Sean A. Irvine
 */
public class A392920 extends Sequence0 {

  private Map<IntArray, Z> mD = new HashMap<>();
  private int mN = -1;

  /** Construct the sequence. */
  public A392920() {
    mD.put(new IntArray(new int[0]), Z.ONE);
  }

  private static final class IntArray {
    private final int[] mA;

    private IntArray(final int[] a) {
      mA = a;
    }

    @Override
    public boolean equals(final Object o) {
      if (!(o instanceof IntArray)) {
        return false;
      }
      final int[] b = ((IntArray) o).mA;
      return Arrays.equals(mA, b);
    }

    @Override
    public int hashCode() {
      int h = 0;
      for (int v : mA) {
        h = 31 * h + v;
      }
      return h;
    }
  }

  private List<IntArray> covers(final IntArray key, final int o) {
    final int[] l = key.mA;
    final int n = l.length;

    final int[] l0 = new int[n + 1];
    System.arraycopy(l, 0, l0, 0, n);
    l0[n] = 2 * n + 2;

    List<int[]> lst = new ArrayList<>();
    if (o == 1) {
      if (n == 0 || l0[0] > 1) {
        lst.add(new int[]{0});
        lst.add(new int[]{1});
      } else {
        lst.add(new int[]{0});
      }
    } else {
      lst.add(new int[0]);
    }

    for (int i = 0; i < n; ++i) {
      final List<int[]> lst2 = new ArrayList<>();
      final int a = l0[i] > 0 ? l0[i] + 1 : 0;
      final int b = l0[i + 1] > 0 ? l0[i + 1] - 1 : 0;
      final int upper = Math.min(2 * (i + 1) + o, b);

      for (int k = a; k <= upper; ++k) {
        for (final int[] base : lst) {
          final int[] next = new int[base.length + 1];
          System.arraycopy(base, 0, next, 0, base.length);
          next[base.length] = k;
          lst2.add(next);
        }
      }
      lst = lst2;
    }

    final List<IntArray> res = new ArrayList<>();
    for (final int[] arr : lst) {
      res.add(new IntArray(arr));
    }
    return res;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Map<IntArray, Z> d2 = new HashMap<>();
    for (Map.Entry<IntArray, Z> e : mD.entrySet()) {
      final IntArray key = e.getKey();
      final Z val = e.getValue();
      for (final IntArray t : covers(key, mN & 1)) {
        d2.merge(t, val, Z::add);
      }
    }
    mD = d2;
    return Functions.SUM.z(mD.values());
  }
}
