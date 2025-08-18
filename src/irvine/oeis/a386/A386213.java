package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386213 allocated for Lechoslaw Ratajczak.
 * @author Sean A. Irvine
 */
public class A386213 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    final Z sigma = Functions.SIGMA1.z(mN);
    if (d.length > Long.SIZE) {
      throw new UnsupportedOperationException();
    }
    long cnt = 0;
    for (long set = 0; set < 1L << (d.length - 1); ++set) {
      long s = set;
      Z sum = sigma;
      for (int k = 0; s != 0; ++k, s >>>= 1) {
        if ((s & 1) == 1) {
          sum = sum.add(d[k]);
        }
      }
      if (sum.mod(mN) == 0 && sum.compareTo(mN) > 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
