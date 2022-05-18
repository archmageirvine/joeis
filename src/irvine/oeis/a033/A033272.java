package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033272 Number of odd nonprimes dividing n.
 * @author Sean A. Irvine
 */
public class A033272 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Jaguar.factor(Z.valueOf(++mN).makeOdd()).divisors()) {
      if (!d.isProbablePrime()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

