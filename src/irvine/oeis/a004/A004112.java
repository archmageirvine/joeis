package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004112 Numbers n where <code>|cos(n)|</code> (or <code>|cosec(n)|</code> or <code>|cot(n)|)</code> decreases monotonically to 0; also <code>|tan(n)|, |sec(n)|, |sin(n)|</code> increases.
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
