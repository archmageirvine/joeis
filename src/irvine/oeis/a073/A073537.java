package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000578;

/**
 * A073537 Rearrangement of cubes such that the sum of two consecutive terms + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A073537 extends Sequence1 {

  private Z mA = Z.ZERO;
  private final HashSet<Z> mUsed = new HashSet<>();

  @Override
  public Z next() {
    final Sequence mCubes = new A000578().skip();
    while (true) {
      final Z c = mCubes.next();
      if (mA.add(c).add(1).isProbablePrime() && mUsed.add(c)) {
        mA = c;
        return c;
      }
    }
  }
}
