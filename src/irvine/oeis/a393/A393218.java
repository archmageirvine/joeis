package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393218 Integers m such that the digits 0 and 1 are not present in the decimal expansion of m^10.
 * @author Sean A. Irvine
 */
public class A393218 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z k = Z.valueOf(++mN);
      if ((Functions.SYNDROME.i(k.pow(10)) & 0b11) == 0) {
        return k;
      }
    }
  }
}
