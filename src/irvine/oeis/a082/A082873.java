package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A082873.
 * @author Sean A. Irvine
 */
public class A082873 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.valueOf(mN + 1).square().divide(4);
    final long m = mN % 12;
    return m <= 1 || m == 4 || m == 6 || m >= 9 ? t : t.subtract(1);
  }
}

