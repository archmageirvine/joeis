package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033170 Positive numbers having the same set of digits in base 6 and base 7.
 * @author Sean A. Irvine
 */
public class A033170 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SYNDROME.i(new Z(Long.toString(++mN, 6))) == Functions.SYNDROME.i(new Z(Long.toString(mN, 7)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
