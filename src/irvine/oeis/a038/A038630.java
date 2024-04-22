package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038630 Number of partitions of n is not squarefree.
 * @author Sean A. Irvine
 */
public class A038630 extends Sequence1 {

  private int mN = 10;

  @Override
  public Z next() {
    while (true) {
      final int index = ++mN;
      final Z p = Functions.PARTITIONS.z(index);
      if (!Jaguar.factor(p).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
