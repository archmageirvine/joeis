package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074230 Numbers n such that A089509(n)=1.
 * @author Sean A. Irvine
 */
public class A074230 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.KRONECKER.l(7, ++mN) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
