package irvine.oeis.a390;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390495 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A390495 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z sumP = Z.ZERO;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(sumP);
          sumP = d[k].isProbablePrime() ? d[k] : Z.ZERO;
        } else if (d[k].isProbablePrime()) {
          sumP = sumP.add(d[k]);
        }
      }
      mA.add(sumP);
    }
    return mA.pollFirst();
  }
}

