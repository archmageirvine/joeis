package irvine.oeis.a068;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068145 Primes of the form a^a + b^b where a and b are positive integers.
 * @author Sean A. Irvine
 */
public class A068145 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    Z nn = Z.valueOf(mN).pow(mN);
    while (mA.isEmpty() || mA.first().compareTo(nn) > 0) {
      for (long k = 1; k <= mN; ++k) {
        final Z t = nn.add(Z.valueOf(k).pow(k));
        if (t.isProbablePrime()) {
          mA.add(t);
        }
      }
      nn = Z.valueOf(++mN).pow(mN);
    }
    return mA.pollFirst();
  }
}
