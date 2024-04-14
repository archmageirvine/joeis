package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067044 Smallest positive k such that k*n contains only even digits.
 * @author Sean A. Irvine
 */
public class A067044 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      long n = ++k * mN;
      if ((Functions.SYNDROME.i(n) & 0b1010101010) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

