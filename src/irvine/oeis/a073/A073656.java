package irvine.oeis.a073;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073656 Rearrangement of Fibonacci numbers such that sum of two consecutive terms is a prime.
 * @author Sean A. Irvine
 */
public class A073656 extends Sequence1 {

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
      final Z c = Functions.FIBONACCI.z(++k);
      if (mA.add(c).isProbablePrime() && mUsed.add(k)) {
        mA = c;
        return c;
      }
    }
  }
}
