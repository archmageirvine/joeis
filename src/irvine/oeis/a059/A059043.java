package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059043 Numbers in which each digit is the (immediate) successor of the previous one (if it exists) and 0 is considered the successor of 9.
 * @author Sean A. Irvine
 */
public class A059043 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      for (long k = 1; k < 10; ++k) {
        mA.add(Z.valueOf(k));
      }
      return Z.ZERO;
    }
    final Z res = mA.pollFirst();
    mA.add(res.multiply(10).add((res.mod(10) + 1) % 10));
    return res;
  }
}
