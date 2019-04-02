package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004112 Numbers n where |cos(n)| (or |cosec(n)| or |cot(n)|) decreases monotonically to 0; also |tan(n)|, |sec(n)|, |sin(n)| increases.
 * @author Sean A. Irvine
 */
public class A004112 implements Sequence {

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
