package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072871 Smallest partition number divisible by n.
 * @author Sean A. Irvine
 */
public class A072871 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z p = Functions.PARTITIONS.z(++k);
      if (p.mod(mN) == 0) {
        return p;
      }
    }
  }
}

