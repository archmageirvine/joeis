package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038630 Number of partitions of n is not squarefree.
 * @author Sean A. Irvine
 */
public class A038630 implements Sequence {

  private int mN = 10;

  @Override
  public Z next() {
    while (true) {
      final Z p = IntegerPartition.partitions(++mN);
      if (!Jaguar.factor(p).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
