package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055977 Product_{q|n} [p(q)] divides p(n), where p(n) is number of unrestricted partitions of n and the product is over all distinct primes q that divide n.
 * @author Sean A. Irvine
 */
public class A055977 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int index = ++mN;
      final Z pn = Functions.PARTITIONS.z(index);
      Z prod = Z.ONE;
      for (final Z p : Jaguar.factor(mN).toZArray()) {
        prod = prod.multiply(Functions.PARTITIONS.z(p));
      }
      if (pn.mod(prod).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
