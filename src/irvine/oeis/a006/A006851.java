package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Quadruple;

/**
 * A006851 Trails of length n on honeycomb lattice.
 * @author Sean A. Irvine
 */
public class A006851 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;

  private final HashSet<Quadruple<Integer>> mVisited = new HashSet<>();

  {
    mVisited.add(new Quadruple<>(0, 0, 1, 0));
  }

  private Z b(final int n, final int ox, final int oy, final int x, final int y) {
    final Quadruple<Integer> v = new Quadruple<>(ox, oy, x, y);
    if (mVisited.contains(v) || mVisited.contains(new Quadruple<>(x, y, ox, oy))) {
      return Z.ZERO;
    } else if (n == 0) {
      return Z.ONE;
    } else {
      mVisited.add(v);
      final Z c = b(n - 1, x, y, x + 1, y).add(b(n - 1, x, y, x - 1, y)).add(b(n - 1, x, y, x, y - 1 + 2 * ((x + y) & 1)));
      mVisited.remove(v);
      return c;
    }
  }

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(1 + 2 * mN);
    }
    return b(mN - 2, 1, 0, 1, 1).multiply(6);
  }
}
