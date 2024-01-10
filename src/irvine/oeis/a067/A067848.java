package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067848 prime(n)+1 divides prime(n^2)+1.
 * @author Sean A. Irvine
 */
public class A067848 extends Sequence1 {

  private final Sequence mA = new A000040();
  private final Sequence mB = new A000040();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = mA.next();
      for (long k = 2; k < 2 * mN; ++k) {
        mB.next();
      }
      if (mB.next().add(1).mod(p.add(1)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
