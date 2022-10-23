package irvine.oeis.a000;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000511 Number of n-step spiral self-avoiding walks on hexagonal lattice, where at each step one may continue in same direction or make turn of 2*Pi/3 counterclockwise.
 * @author Sean A. Irvine
 */
public class A000511 extends Sequence0 {

  private static final int[] DX = {2, 1, -1, -2, -1, 1};
  private static final int[] DY = {0, 1, 1, 0, -1, -1};

  private int mN = -1;

  private long extend(final int x, final int y, final int d, final HashSet<String> seen, final int leftToDo) {
    final String key = x + "_" + y;
    if (!seen.add(key)) {
      return 0;
    }
    final long c;
    if (leftToDo == 0) {
      c = 1;
    } else {
      final int rd = (d + 2) % 6;
      c = extend(x + DX[d], y + DY[d], d, seen, leftToDo - 1)
        + extend(x + DX[rd], y + DY[rd], rd, seen, leftToDo - 1);
    }
    seen.remove(key);
    return c;
  }

  @Override
  public Z next() {
    final HashSet<String> seen = new HashSet<>();
    seen.add("0_0");
    return ++mN == 0 ? Z.ONE : Z.valueOf(extend(DX[0], DY[0], 0, seen, mN - 1));
  }
}
