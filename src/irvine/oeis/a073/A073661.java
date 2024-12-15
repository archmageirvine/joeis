package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073661 Rearrangement of even numbers such that a(k) + a(k+1) + 1 is a prime for all k.
 * @author Sean A. Irvine
 */
public class A073661 extends Sequence1 {

  private Z mA = Z.ZERO;
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    long k = 0;
    while (true) {
      k += 2;
      if (mA.add(k + 1).isProbablePrime() && mUsed.add(k)) {
        mA = Z.valueOf(k);
        return mA;
      }
    }
  }
}
