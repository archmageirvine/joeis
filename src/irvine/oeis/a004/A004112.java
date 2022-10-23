package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004112 Numbers k where |cos(k)| (or |cosec(k)| or |cot(k)|) decreases monotonically to 0; also |tan(k)|, |sec(k)|, |sin(k)| increases.
 * @author Sean A. Irvine
 */
public class A004112 extends Sequence1 {

  private long mN = -1;
  private CR mA = CR.ONE.negate();

  @Override
  public Z next() {
    while (true) {
      final CR b = CR.valueOf(++mN).sin().abs();
      if (b.compareTo(mA) > 0) {
        mA = b;
        return Z.valueOf(mN);
      }
    }
  }
}
