package irvine.oeis.a386;

import java.util.HashMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A386278 allocated for Matthew Campbell.
 * @author Sean A. Irvine
 */
public class A386278 extends Sequence0 {

  private static final CR PI4 = CR.PI.divide(4);
  private static final CR PI34 = PI4.multiply(3);
  private final HashMap<Pair<Integer, Integer>, Long> mLabels = new HashMap<>();
  private long mN = -1;
  private int mX = 0;
  private int mY = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      mLabels.put(new Pair<>(0, 0), 0L);
      return Z.ZERO;
    }
    final CR theta = CR.valueOf(mN).square().mod(CR.PI);
    if (theta.compareTo(PI4) < 0) {
      ++mX;
    } else if (theta.compareTo(CR.HALF_PI) < 0) {
      ++mY;
    } else if (theta.compareTo(PI34) < 0) {
      --mX;
    } else {
      --mY;
    }
    return Z.valueOf(mLabels.computeIfAbsent(new Pair<>(mX, mY), k -> mN));
  }
}

