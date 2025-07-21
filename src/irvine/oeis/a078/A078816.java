package irvine.oeis.a078;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007404;

/**
 * A078800.
 * @author Sean A. Irvine
 */
public class A078816 extends Sequence1 implements Conjectural {

  // todo This is nowhere near accurate enough and too slow

  private static final int HEURISTIC = 500;
  private static final CR SUM = new A007404().getCR();
  private int mN = 0;

  private static Z continuedFractionMax(CR x) {
    Z max = Z.ZERO;
    int k = 0;
    while (true) {
      final Z a = x.floor();
      if (a.compareTo(max) > 0) {
        k = 0;
        max = a;
      } else if (++k > HEURISTIC) {
        return max;
      }
      x = x.subtract(CR.valueOf(a));
      x = x.inverse();
    }
  }

  @Override
  public Z next() {
    return continuedFractionMax(SUM.divide(++mN));
  }
}
