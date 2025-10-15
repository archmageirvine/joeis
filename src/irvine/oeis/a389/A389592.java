package irvine.oeis.a389;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389592 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A389592 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z sum = Z.ZERO;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(sum);
          sum = Z.ZERO;
        } else {
          sum = sum.add(d[k]);
        }
      }
      mA.add(sum);
    }
    return mA.pollFirst();
  }
}

