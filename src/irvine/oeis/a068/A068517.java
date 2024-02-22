package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A068517 a(2n) = concatenation of 4n+1 and 4n+2, a(2n+1) = concatenation of the two most nearly equal numbers whose product is a(2n).
 * @author Sean A. Irvine
 */
public class A068517 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if ((++mN & 1) == 0) {
      return new Z(String.valueOf(2 * mN + 1) + (2 * mN + 2));
    } else {
      final Z t = new Z(String.valueOf(2 * (mN - 1) + 1) + (2 * (mN - 1) + 2));
      final Z[] d = Jaguar.factor(t).divisorsSorted();
      return new Z(d[d.length / 2 - 1].toString() + d[d.length / 2].toString());
    }
  }
}

