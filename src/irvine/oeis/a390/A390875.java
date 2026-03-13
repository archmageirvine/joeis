package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390875 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A390875 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      long cnt = mN & 1;
      Z sum = Z.valueOf(cnt);
      for (int k = 1; k < d.length; ++k) {
        final long conjugate = mN / d[k].longValue();
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(sum.divide(cnt));
          if ((conjugate & 1) == 1) {
            cnt = 1;
            sum = Z.valueOf(conjugate);
          } else {
            cnt = 0;
            sum = Z.ZERO;
          }
        } else if ((conjugate & 1) == 1) {
          sum = sum.add(conjugate);
          ++cnt;
        }
      }
      if (!sum.isZero()) {
        mA.add(sum.divide(cnt));
      }
    }
    return mA.pollFirst();
  }
}

