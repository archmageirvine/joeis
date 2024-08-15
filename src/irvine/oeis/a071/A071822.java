package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071822 Numbers whose largest prime factor is of the form 4k+3.
 * @author Sean A. Irvine
 */
public class A071822 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if ((Functions.GPF.l(++mN) & 3) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
