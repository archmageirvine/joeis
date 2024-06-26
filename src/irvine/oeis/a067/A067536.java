package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067536 Numbers k such that phi(k*(k+1)*(k+2)/3)/phi(k) is not an integer where phi(k) is the Euler totient function A000010(k).
 * @author Sean A. Irvine
 */
public class A067536 extends Sequence1 {

  private long mN = 8;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN * (mN + 1) * (mN + 2) / 3;
      final Z a = Functions.PHI.z(n);
      final Z b = Functions.PHI.z(mN);
      if (!a.mod(b).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
