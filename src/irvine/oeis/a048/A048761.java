package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048761 Smallest square greater than or equal to n.
 * @author Sean A. Irvine
 */
public class A048761 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = Functions.SQRT.l(++mN);
    return s * s == mN ? Z.valueOf(s * s) : Z.valueOf((s + 1) * (s + 1));
  }
}
