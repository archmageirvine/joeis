package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053187 Square nearest to n.
 * @author Sean A. Irvine
 */
public class A053187 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long n = ++mN;
    final long s = Functions.SQRT.l(n);
    final long s2 = s * s;
    final long t2 = (s + 1) * (s + 1);
    return Z.valueOf(Math.abs(s2 - mN) < Math.abs(mN - t2) ? s2 : t2);
  }
}

