package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053188 Distance from n to nearest square.
 * @author Sean A. Irvine
 */
public class A053188 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = Functions.SQRT.l(++mN);
    final long s2 = s * s;
    final long t2 = (s + 1) * (s + 1);
    return Z.valueOf(Math.min(Math.abs(s2 - mN), Math.abs(mN - t2)));
  }
}

