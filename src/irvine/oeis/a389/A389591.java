package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389591 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A389591 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    Z sum = Z.ZERO;
    for (int k = 1; k < d.length; ++k) {
      if (d[k].compareTo(d[k - 1].multiply2()) <= 0) {
        sum = sum.add(d[k]);
      }
    }
    return sum;
  }
}

