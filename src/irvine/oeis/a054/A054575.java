package irvine.oeis.a054;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A054575 Number of iterations to reach new prime in A054574.
 * @author Sean A. Irvine
 */
public class A054575 extends A000040 {

  @Override
  public Z next() {
    long cnt = 1;
    Z n = super.next().multiply2(); // obviously never prime
    do {
      n = n.add(Cheetah.factor(n).sopfr());
      ++cnt;
    } while (!n.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
