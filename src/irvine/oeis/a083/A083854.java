package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083854 Numbers that are squares, twice squares, three times squares, or six times squares, i.e., numbers whose squarefree part divides 6.
 * @author Sean A. Irvine
 */
public class A083854 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (6 % Functions.CORE.l(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
