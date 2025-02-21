package irvine.oeis.a075;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a073.A073672;

/**
 * A075470 Primes arising from the rearrangement of the natural numbers such that sum of n (n&gt;1) terms starting from the n-th term (included) is a prime (A073672).
 * @author Sean A. Irvine
 */
public class A075470 extends A073672 {

  private final List<Z> mA = new ArrayList<>();
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z t = super.next();
      mSum = mSum.add(t);
      mA.add(t);
    } else {
      for (int k = 0; k < 2; ++k) {
        final Z t = super.next();
        mSum = mSum.add(t);
        mA.add(t);
      }
      mSum = mSum.subtract(mA.remove(0));
    }
    return mSum;
  }
}
