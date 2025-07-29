package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079032 Smallest nontrivial partition number divisible by the n-th partition number.
 * @author Sean A. Irvine
 */
public class A079032 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z pn = Functions.PARTITIONS.z(++mN);
    int k = Math.max(mN, 1);
    while (true) {
      final Z pk = Functions.PARTITIONS.z(++k);
      if (pk.mod(pn).isZero()) {
        return pk;
      }
    }
  }
}
