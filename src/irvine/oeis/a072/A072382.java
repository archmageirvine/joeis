package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072382 Primes which can be represented as the sum of a number and its reverse.
 * @author Sean A. Irvine
 */
public class A072382 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN) >= 0) {
      mN = mN.add(1);
      final Z t = Functions.REVERSE_AND_ADD.z(mN);
      if (t.isProbablePrime()) {
        mA.add(t);
      }
    }
    return mA.pollFirst();
  }
}
