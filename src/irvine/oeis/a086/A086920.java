package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086920 Smallest k such that n times concatenation of k with itself followed by a 1 is a prime, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A086920 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (new Z(String.valueOf(++k).repeat(mN) + "1").isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
