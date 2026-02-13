package irvine.oeis.a393;

import java.util.HashMap;
import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393185 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A393185 extends Sequence1 {

  private final HashMap<Long, Long> mT = new HashMap<>();
  private final HashSet<Long> mS = new HashSet<>();
  private long mK = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mK == 28) {
        return Z.SIX;
      }
      final long d = Functions.SIGMA1.l(mK) - 2 * mK;
      if (mT.putIfAbsent(d, mK) == null) {
        if (mT.containsKey(-d)) {
          if (mS.add(mK) && mK != 6) {
            return Z.valueOf(Math.min(mK, mT.get(-d)));
          }
        }
      }
    }
  }
}
