package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073580.
 * @author Sean A. Irvine
 */
public class A073658 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    long k = 1;
    while (true) {
      final Z s = Z.valueOf(++k).square();
      if (mA.add(s).isProbablePrime() && mUsed.add(k)) {
        mA = s;
        return s;
      }
    }
  }
}
