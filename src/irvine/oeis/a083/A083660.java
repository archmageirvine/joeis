package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A083660 Smallest nonnegative integer m such that the concatenation of the integers from n to 1 interspersed with those of m, in base 10, is prime.
 * @author Sean A. Irvine
 */
public class A083660 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      final StringBuilder sb = new StringBuilder();
      for (int j = mN; j > 0; --j) {
        if (j != mN) {
          sb.append(k);
        }
        sb.append(j);
      }
      if (new Z(sb).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
