package irvine.oeis.a086;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086832 Number of ways to tile an n X n board having a black border with the following 1 X 1 tiles: bbbb, bbww, wbbw, bwwb, wwbb, where the colors are read clockwise around each tile.
 * @author Sean A. Irvine
 */
public class A086832 extends Sequence1 {

  // After Jeff Sponaugle

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Generate all valid row masks
    final int limit = 1 << (mN - 1);
    final int[] rows = new int[limit];
    int nr = 0;
    for (int x = 0; x < limit; ++x) {
      if ((x & (x << 1)) == 0) {
        rows[nr++] = x | (x << 1);
      }
    }
    // State = columns whose current vertical run has odd length.
    Map<Integer, Z> v = new HashMap<>();
    v.put(0, Z.ONE);
    for (int i = 0; i < mN; ++i) {
      final Map<Integer, Z> w = new HashMap<>();
      for (final Map.Entry<Integer, Z> e : v.entrySet()) {
        final int s = e.getKey();
        final Z c = e.getValue();

        for (int j = 0; j < nr; ++j) {
          final int r = rows[j];
          if ((r & s) == s) {
            final int ns = r ^ s;
            w.merge(ns, c, Z::add);
          }
        }
      }
      v = w;
    }
    return v.getOrDefault(0, Z.ZERO);
  }
}
