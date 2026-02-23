package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083855 Multiplicands in the list of numbers which are squares, twice squares, three times squares, or six times squares (A083854).
 * @author Sean A. Irvine
 */
public class A083855 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long core = Functions.CORE.l(++mN);
      if (6 % core == 0) {
        return Z.valueOf(core);
      }
    }
  }
}
