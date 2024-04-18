package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066788 a(n) = gcd(phi(n), n^2 + 1).
 * @author Sean A. Irvine
 */
public class A066788 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n = ++mN;
    return Functions.PHI.z(n).gcd(Z.valueOf(mN).square().add(1));
  }
}

