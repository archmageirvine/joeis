package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073580.
 * @author Sean A. Irvine
 */
public class A073662 extends Sequence1 {

  private Z mA = Z.ONE;
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      k += 2;
      if (!mUsed.contains(k) && mA.multiply(k).add(1).isProbablePrime()) {
        mUsed.add(k);
        mA = Z.valueOf(k);
        return mA;
      }
    }
  }
}
