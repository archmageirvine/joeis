package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A067790 Numbers n such that n and prime(n) end with the same digit.
 * @author Sean A. Irvine
 */
public class A067790 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A000040();

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 == mA.next().mod(10)) {
        return Z.valueOf(mN);
      }
    }
  }
}
