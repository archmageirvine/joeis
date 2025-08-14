package irvine.oeis.a079;

import java.util.HashMap;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A079421 Spiro-Fibonacci differences, a(n) = difference of two previous terms that are nearest when terms arranged in a spiral.
 * @author Sean A. Irvine
 */
public class A079421 extends Sequence0 {

  private static final int[] DELTA_X = {1, -1, 0, 0, 1, -1, 1, -1};
  private static final int[] DELTA_Y = {0, 0, 1, -1, 1, 1, -1, -1};
  private final Map<Pair<Integer, Integer>, Integer> mMap = new HashMap<>();
  private long mN = -2;
  private int mX = 0;
  private int mY = 0;

  @Override
  public Z next() {
    if (++mN == -1) {
      mMap.put(new Pair<>(0, 0), 0);
      return Z.ZERO;
    }
    final long n = 4 * mN + 1;
    switch (Functions.SQRT.i(n) & 3) {
      case 0:
        --mY;
        break;
      case 1:
        ++mX;
        break;
      case 2:
        ++mY;
        break;
      case 3:
        --mX;
        break;
    }
    if (mMap.size() == 1) {
      mMap.put(new Pair<>(mX, mY), 1);
      return Z.ONE;
    }
    // Find two closest defined
    int first = -1;
    for (int k = 0; k < DELTA_X.length; ++k) {
      final int nx = mX + DELTA_X[k];
      final int ny = mY + DELTA_Y[k];
      final Integer val = mMap.get(new Pair<>(nx, ny));
      if (val != null) {
        if (first < 0) {
          first = val;
        } else {
          final int res = Math.abs(first - val);
          mMap.put(new Pair<>(mX, mY), res);
          return Z.valueOf(res);
        }
      }
    }
    throw new RuntimeException();
  }
}

