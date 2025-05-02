package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A381103.
 * @author Sean A. Irvine
 */
public class A383356 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long s = Functions.DIGIT_SUM.l(Functions.TRIANGULAR.z(++mN));
    long k = 0;
    while (true) {
      if (Functions.DIGIT_SUM.l(Z.valueOf(++k).multiply(7 * k - 5).divide2()) == s) {
        return Z.valueOf(k);
      }
    }
  }
}
