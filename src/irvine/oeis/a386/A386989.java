package irvine.oeis.a386;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386989 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A386989 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      Z prod = Z.ONE;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(prod);
          prod = d[k];
        } else {
          prod = prod.multiply(d[k]);
        }
      }
      mA.add(prod);
    }
    return mA.pollFirst();
  }
}

