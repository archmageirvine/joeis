package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068125 Possible final digits of a triangular number.
 * @author Sean A. Irvine
 */
public class A068125 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mMod = null;

  @Override
  public Z next() {
    if (mMod == null) {
      mMod = Z.ONE;
      return Z.ZERO;
    }
    if (mA.isEmpty()) {
      final Z lo = mMod;
      mMod = mMod.multiply(10);
      final Sequence triangular = new A000217();
      Z lastSeen = Z.NEG_ONE;
      while (true) {
        final Z t = triangular.next().mod(mMod);
        if (t.equals(lastSeen)) {
          break;
        }
        if (t.compareTo(lo) >= 0 && mA.add(t)) {
          lastSeen = t;
        }
      }
    }
    return mA.pollFirst();
  }
}
