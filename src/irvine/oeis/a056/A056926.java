package irvine.oeis.a056;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056926 a(n) = sqrt(n) if n is a square, otherwise 1.
 * @author Sean A. Irvine
 */
public class A056926 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    return s * s == mN ? Z.valueOf(s) : Z.ONE;
  }
}
