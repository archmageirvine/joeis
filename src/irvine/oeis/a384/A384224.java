package irvine.oeis.a384;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384224 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A384224 extends Sequence1 {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      int c = 0;
      for (final Z z : d) {
        if (z.isOdd()) {
          if (c != 0) {
            mA.add(c);
          }
          c = 1;
        } else {
          ++c;
        }
      }
      if (c != 0) {
        mA.add(c);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}

