package irvine.oeis.a240;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A240545 Least k &gt; 0 such that n + p(k) is prime, where p(k) is the number of partitions of k.
 * @author Sean A. Irvine
 */
public class A240545 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      final int index = ++k;
      if (Functions.PARTITIONS.z(index).add(mN).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
