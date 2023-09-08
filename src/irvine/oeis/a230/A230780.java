package irvine.oeis.a230;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A230780 Positive numbers without a prime factor congruent to 1 (mod 6).
 * @author Sean A. Irvine
 */
public class A230780 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      boolean busy = true;
      for (final Z p : Jaguar.factor(++mN).toZArray()) {
        if (p.mod(6) == 1) {
          busy = false;
        }
      }
      if (busy) {
        return Z.valueOf(mN);
      }
    }
  }
}
