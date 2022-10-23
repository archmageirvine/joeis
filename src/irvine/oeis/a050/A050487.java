package irvine.oeis.a050;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050487 Geometric Connell sequence: start with 1; then next two numbers == 2 mod 3; next four == 3 mod 3; next eight == 1 mod 3; etc.
 * @author Sean A. Irvine
 */
public class A050487 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(3 * ++mN - 2 * (1 + LongUtils.lg(mN)));
  }
}
