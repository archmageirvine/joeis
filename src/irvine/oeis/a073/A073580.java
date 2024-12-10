package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073580 Rearrangement of Fibonacci numbers such that the sum of two consecutive terms + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A073580 extends Sequence1 {

  private Z mA = null;
  private final HashSet<Long> mUsed = new HashSet<>();

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    long k = 0;
    while (true) {
      final Z c = Functions.FIBONACCI.z(++k);
      if (mA.add(c).add(1).isProbablePrime() && mUsed.add(k)) {
        mA = c;
        return c;
      }
    }
  }
}
