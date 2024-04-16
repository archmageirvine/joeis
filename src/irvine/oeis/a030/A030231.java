package irvine.oeis.a030;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030231 Numbers with an even number of distinct prime factors.
 * @author Sean A. Irvine
 */
public class A030231 extends Sequence1 {

  private long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      if ((Functions.OMEGA.i(++mN) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
