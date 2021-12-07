package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053044 a(n) is the number of iterations of the Euler totient function to reach 1, starting at n!.
 * @author Sean A. Irvine
 */
public class A053096 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    Z s = super.next();
    long cnt = 0;
    while (!Z.ONE.equals(s)) {
      ++cnt;
      s = Jaguar.factor(s).phi();
    }
    return Z.valueOf(cnt);
  }
}
