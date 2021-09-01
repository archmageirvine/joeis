package irvine.oeis.a051;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Cheetah;
import irvine.math.MutableInteger;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051278.
 * @author Sean A. Irvine
 */
public class A051278 implements Sequence {

  private final TreeMap<Long, MutableInteger> mSeen = new TreeMap<>();
  private long mM = 1;

  protected int target() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      while (mSeen.isEmpty() || mM <= 4 * mSeen.firstKey() * mSeen.firstKey()) {
        final Z s0 = Cheetah.factor(mM).sigma0();
        if (s0.bitLength() < 64) {
          final long s = s0.longValue();
          if (mM % s == 0) {
            final long r = mM / s;
            final MutableInteger cnt = mSeen.get(r);
            if (cnt != null) {
              cnt.postIncrement();
            } else {
              mSeen.put(r, new MutableInteger(1));
            }
          }
        }
        ++mM;
      }
      final Map.Entry<Long, MutableInteger> e = mSeen.pollFirstEntry();
      if (e.getValue().get() == target()) {
        return Z.valueOf(e.getKey());
      }
    }
  }
}
