package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069578 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long sopfr = Functions.SOPFR.l(++mN);
      if (mN == Functions.REVERSE.l(mN) + 2 * sopfr) {
        return Z.valueOf(mN);
      }
    }
  }
}
