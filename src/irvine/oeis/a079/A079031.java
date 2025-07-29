package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079031 Least k &gt; n such that p(n) divides p(k), where p(k) denotes the k-th partition number (A000041).
 * @author Sean A. Irvine
 */
public class A079031 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z pn = Functions.PARTITIONS.z(++mN);
    int k = mN;
    while (true) {
      if (Functions.PARTITIONS.z(++k).mod(pn).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
