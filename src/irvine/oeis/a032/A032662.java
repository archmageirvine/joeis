package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032662 a(n) is the least k such that k concatenated with k + n is prime.
 * @author Sean A. Irvine
 */
public class A032662 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long l = 0;
    while (true) {
      if (new Z(String.valueOf(++l) + (mN + l)).isProbablePrime()) {
        return Z.valueOf(l);
      }
    }
  }
}
