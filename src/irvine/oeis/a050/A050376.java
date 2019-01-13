package irvine.oeis.a050;

import java.util.Map;

import irvine.math.PrimePowers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A050376.
 * @author Sean A. Irvine
 */
public class A050376 implements Sequence {

  private final PrimePowers mPP = new PrimePowers();
  {
    mPP.next(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Long, Pair<Long, Long>> e = mPP.next();
      final long exponent = e.getValue().right();
      if ((exponent & (exponent - 1)) == 0) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}
