package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;
import irvine.oeis.a000.A000142;

/**
 * A046668 Numbers n such that partition function p(n) divides n!.
 * @author Sean A. Irvine
 */
public class A046668 extends Sequence1 {

  private long mN = -1;
  private final Sequence mF = new A000142();
  private final Sequence mPartitions = new A000041();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mF.next().mod(mPartitions.next()).isZero() && mN > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
