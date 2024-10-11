package irvine.oeis.a068;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068126 Smallest triangular number whose final digits are A068125(n).
 * @author Sean A. Irvine
 */
public class A068126 extends Sequence1 {

  private final TreeMap<Z, Z> mA = new TreeMap<>();
  private Z mMod = null;

  @Override
  public Z next() {
    if (mMod == null) {
      mMod = Z.ONE;
      return Z.TEN;
    }
    if (mA.isEmpty()) {
      final Z lo = mMod;
      mMod = mMod.multiply(10);
      final Sequence triangular = new A000217();
      Z lastSeen = Z.NEG_ONE;
      while (true) {
        final Z v = triangular.next();
        final Z t = v.mod(mMod);
        if (t.equals(lastSeen)) {
          break;
        }
        if (t.compareTo(lo) >= 0 && !mA.containsKey(t)) {
          mA.put(t, v);
          lastSeen = t;
        }
      }
    }
    return mA.pollFirstEntry().getValue();
  }
}
