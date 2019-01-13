package irvine.oeis.a239;

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A239936.
 * @author Sean A. Irvine
 */
public class A239936 extends A000009 {

  @Override
  public Z next() {
    final Z pn = super.next();
    int k = 0;
    while (true) {
      if (pn.add(IntegerPartition.partitions(++k)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
