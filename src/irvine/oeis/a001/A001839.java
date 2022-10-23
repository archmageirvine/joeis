package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001839 The coding-theoretic function A(n,4,3).
 * @author Sean A. Irvine
 */
public class A001839 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long r = ++mN % 6;
    final long a = ((mN - 1) / 2) * mN / 3;
    if (r == 5) {
      return Z.valueOf(a - 1);
    } else {
      return Z.valueOf(a);
    }
  }
}
