package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014209 a(n) = n^2 + 3*n - 1.
 * @author Sean A. Irvine
 */
public class A014209 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().add(3 * mN - 1);
  }
}
