package irvine.oeis.a158;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A158699 Start with 0; then add one to each single digit.
 * @author Sean A. Irvine
 */
public class A158699 extends Sequence1 {

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
    final long t = res.mod(10) - 1;
    mA.add(res.multiply(10).add(t < 0 ? 9 : t));
    return res;
  }
}
