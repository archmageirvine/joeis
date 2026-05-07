package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084726 Smallest common difference of the arithmetic progression of length n, beginning with 1 whose product of first n terms + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A084726 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long d = 0;
    while (true) {
      ++d;
      Z prod = Z.ONE;
      for (long k = 1; k < mN; ++k) {
        prod = prod.multiply(1 + k * d);
      }
      if (prod.add(1).isProbablePrime()) {
        return Z.valueOf(d);
      }
    }
  }
}
