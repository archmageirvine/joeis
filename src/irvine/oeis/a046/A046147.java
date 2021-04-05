package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046147 Triangle read by rows in which row n lists the primitive roots mod n (omitting numbers n without a primitive root).
 * @author Sean A. Irvine
 */
public class A046147 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z phi = Z.valueOf(LongUtils.phi(++mN));
      final IntegersModMul rn = new IntegersModMul(mN);
      for (long q = 1; q <= mN; ++q) {
        if (LongUtils.gcd(q, mN) == 1 && rn.order(Z.valueOf(q)).equals(phi)) {
          mA.add(q);
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
