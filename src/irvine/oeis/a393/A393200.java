package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A393200 allocated for Diego Artacho.
 * @author Sean A. Irvine
 */
public class A393200 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    int b = 1;
    while (true) {
      if (Functions.GCD.l(mN, Functions.DIGIT_SUM.l(++b, mN)) == 1) {
        return Z.valueOf(b);
      }
    }
  }
}
