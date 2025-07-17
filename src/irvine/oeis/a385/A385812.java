package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a063.A063655;

/**
 * A385812 allocated for Richard S. Chang.
 * @author Sean A. Irvine
 */
public class A385812 extends Sequence1 {

  private final Sequence mA = new A063655();
  private Z mT = mA.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z u = mT;
      mT = mA.next();
      if (u.compareTo(mT) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
