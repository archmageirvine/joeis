package irvine.oeis.a239;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A239736.
 * @author Sean A. Irvine
 */
public class A239736 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    final Z pn = IntegerPartition.partitions(++mN);
    int k = 0;
    while (true) {
      if (pn.add(IntegerPartition.partitions(++k)).subtract(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
