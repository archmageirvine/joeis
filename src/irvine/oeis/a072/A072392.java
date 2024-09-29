package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072392 Numbers n such that reverse(n) = phi(n) (mod n).
 * @author Sean A. Irvine
 */
public class A072392 extends Sequence1 {

  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      if (Functions.REVERSE.l(++mN) % mN == Functions.PHI.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
