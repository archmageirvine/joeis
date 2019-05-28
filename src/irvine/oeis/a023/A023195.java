package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023195 Prime numbers that are the sum of the divisors of some n.
 * @author Sean A. Irvine
 */
public class A023195 implements Sequence {

  // Heuristic to order -- will detect a failure
  // TreeSet also gets rid of repeats like 31 occurring twice

  private static final int REORDER_BUFFER = 5;
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    // This is safe 3 is definitely first member
    if (mN == 0) {
      mN = 1;
      return Z.THREE;
    }
    while (mA.size() < REORDER_BUFFER) {
      final Z n2 = Z.valueOf(++mN).square();
      final Z sigma = Cheetah.factor(n2).sigma();
      if (sigma.isProbablePrime()) {
        mA.add(sigma);
      }
    }
    final Z res = mA.pollFirst();
    if (mPrev.compareTo(res) >= 0) {
      throw new RuntimeException("Heuristic failed, need larger REORDER_BUFFER");
    }
    mPrev = res;
    return res;
  }
}
