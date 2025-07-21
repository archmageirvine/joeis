package irvine.oeis.a385;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence0;

/**
 * A385493 Number of distinct states in Conway's Game of Life acting on a (2n+1) X (2n+1) toroidal grid starting with (x,y) turned on if and only if x-n + (y-n)*i is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A385493 extends Sequence0 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private int mN = -1;
  private int[] mDeltaX = null;
  private int[] mDeltaY = null;

  private boolean[][] gameOfLifeStep(final boolean[][] torus) {
    final int d = torus.length;
    final boolean[][] next = new boolean[d][d];
    for (int x = 0; x < d; ++x) {
      for (int y = 0; y < d; ++y) {
        int nc = 0;
        for (int k = 0; k < mDeltaX.length; ++k) {
          if (torus[(x + mDeltaX[k]) % d][(y + mDeltaY[k]) % d]) {
            ++nc;
          }
        }
        if (torus[x][y]) {
          if (nc == 2 || nc == 3) {
            next[x][y] = true;
          }
        } else if (nc == 3) {
          next[x][y] = true;
        }
      }
    }
    return next;
  }

  @Override
  public Z next() {
    ++mN;
    final int d = 2 * mN + 1;
    boolean[][] torus = new boolean[d][d];
    for (int x = 0; x < d; ++x) {
      for (int y = 0; y < d; ++y) {
        if (G.isProbablePrime(new Zi(x - mN, y - mN))) {
          torus[x][y] = true;
        }
      }
    }
    mDeltaX = new int[] {1, d - 1, 0, 0, 1, d - 1, 1, d - 1};
    mDeltaY = new int[] {0, 0, 1, d - 1, 1, 1, d - 1, d - 1};
    final HashSet<String> states = new HashSet<>();
    while (states.add(Arrays.deepToString(torus))) {
      torus = gameOfLifeStep(torus);
    }
    return Z.valueOf(states.size());
  }
}
