package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069003.
 * @author Sean A. Irvine
 */
public class A069004 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    final Z n2 = Z.valueOf(++mN).square();
    for (long m = 1; m < mN; ++m) {
      if (n2.add(Z.valueOf(m).square()).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

