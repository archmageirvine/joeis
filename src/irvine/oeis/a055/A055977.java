package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055977 Product_{q|n} [p(q)] divides p(n), where p(n) is number of unrestricted partitions of n and the product is over all distinct primes q that divide n.
 * @author Sean A. Irvine
 */
public class A055977 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z pn = IntegerPartition.partitions(++mN);
      Z prod = Z.ONE;
      for (final Z p : Jaguar.factor(mN).toZArray()) {
        prod = prod.multiply(IntegerPartition.partitions(p.intValue()));
      }
      if (pn.mod(prod).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
