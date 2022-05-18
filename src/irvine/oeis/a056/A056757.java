package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056757 Cube of number of divisors is larger than the number.
 * @author Sean A. Irvine
 */
public class A056757 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma0().pow(3).compareTo(mN) > 0) {
        return mN;
      }
    }
  }
}
