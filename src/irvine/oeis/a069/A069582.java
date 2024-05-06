package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069582 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      final Z[] divs = Jaguar.factor(++mN).divisorsSorted();
      for (int k = divs.length - 1; k >= 0; --k) {
        sb.append(divs[k]);
      }
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
