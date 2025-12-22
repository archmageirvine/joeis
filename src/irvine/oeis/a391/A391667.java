package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000070;

/**
 * A391667 Numbers j such that the average of the first j+1 partition numbers (beginning with p(0)) is an integer.
 * @author Sean A. Irvine
 */
public class A391667 extends Sequence1 {

  private final Sequence mS = new A000070();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mS.next().mod(++mN) == 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
