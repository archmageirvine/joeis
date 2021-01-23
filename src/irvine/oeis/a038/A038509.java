package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038509 Composite numbers congruent to +-1 mod 6.
 * @author Sean A. Irvine
 */
public class A038509 implements Sequence {

  private Z mN = Z.valueOf(23);
  private long mAdd = 4;

  @Override
  public Z next() {
    while (true) {
      mAdd = 6 - mAdd;
      mN = mN.add(mAdd);
      if (!mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}
