package irvine.oeis.a086;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086956 a(1)=1, for n&gt;1: a(n) is the smallest divisor of n occurring earlier at most twice.
 * @author Sean A. Irvine
 */
public class A086956 extends Sequence1 {

  private final HashMap<Z, Integer> mUsed = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (final Z d : Jaguar.factor(mN).divisorsSorted()) {
      if (mUsed.merge(d, 1, (x, y) -> Math.min(4, x + y)) <= 3) {
        return d;
      }
    }
    throw new RuntimeException();
  }
}
