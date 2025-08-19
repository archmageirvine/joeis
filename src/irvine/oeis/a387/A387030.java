package irvine.oeis.a387;

import java.util.LinkedList;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387030 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A387030 extends Sequence1 {

  private final LinkedList<Integer> mA = new LinkedList<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      final Z[] d = Jaguar.factor(++mN).divisorsSorted();
      int c = 0;
      for (int k = 1; k < d.length; ++k) {
        if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
          mA.add(c);
          c = d[k].isProbablePrime() ? 1 : 0;
        } else if (d[k].isProbablePrime()) {
          ++c;
        }
      }
      mA.add(c);
    }
    return Z.valueOf(mA.pollFirst());
  }
}

