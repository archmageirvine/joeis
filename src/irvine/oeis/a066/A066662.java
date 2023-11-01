package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066662 Shortest leg of a Pythagorean triangle with a hypotenuse of length 5n.
 * @author Sean A. Irvine
 */
public class A066662 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 5;
    final long n2 = mN * mN;
    long k = 0;
    while (true) {
      if (LongUtils.isSquare(n2 - ++k * k)) {
        return Z.valueOf(k);
      }
    }
  }
}
