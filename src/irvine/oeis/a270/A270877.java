package irvine.oeis.a270;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A270877.
 * @author Sean A. Irvine
 */
public class A270877 implements Sequence {

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
