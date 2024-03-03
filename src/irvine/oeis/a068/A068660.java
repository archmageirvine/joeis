package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A068660 extends Sequence1 {

  private long mN = 6;

  @Override
  public Z next() {
    while (true) {
      final StringBuilder sb = new StringBuilder();
      sb.append(++mN);
      sb.append(mN + 1);
      sb.append(mN);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
