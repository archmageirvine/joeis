package irvine.oeis.a270;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A270877 Numbers surviving a decaying sieve.
 * @author Sean A. Irvine
 */
public class A270877 extends Sequence1 {

  private long mN = 0;
  private final HashSet<Long> mForbidden = new HashSet<>();

  @Override
  public Z next() {
    while (true) {
      if (!mForbidden.remove(++mN)) {
        for (long a = mN, b = mN - 1; b > 0; --b) {
          a += b;
          mForbidden.add(a);
        }
        return Z.valueOf(mN);
      }
    }
  }
}
