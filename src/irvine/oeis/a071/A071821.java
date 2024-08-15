package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071821 Numbers whose largest prime factor is of the form 4k+1.
 * @author Sean A. Irvine
 */
public class A071821 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      if ((Functions.GPF.l(++mN) & 3) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
