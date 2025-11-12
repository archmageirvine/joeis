package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390443 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A390443 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z c = Z.ZERO;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(c);
          c = d[k].isEven() ? d[k] : Z.ZERO;
        } else if (d[k].isEven()) {
          c = c.add(d[k]);
        }
      }
      mA.add(c);
    }
    return mA.pollFirst();
  }
}

