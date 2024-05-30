package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053616 Pyramidal sequence: distance to nearest triangular number.
 * @author Sean A. Irvine
 */
public class A053616 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long n = 2 * ++mN;
    final long s = Functions.SQRT.l(n);
    return Z.valueOf(Math.abs(Math.min(mN - s * (s + 1) / 2, (s + 1) * (s + 2) / 2 - mN)));
  }
}
