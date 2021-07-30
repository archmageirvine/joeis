package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.IntersectionSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a031.A031443;

/**
 * A049364 Smallest number that is digitally balanced in all bases 2, 3, ... n.
 * @author Sean A. Irvine
 */
public class A049364 implements Sequence {

  private Sequence mA = new A031443();
  private int mN = 1;

  @Override
  public Z next() {
    if (++mN > 2) {
      mA = new IntersectionSequence(mA, new A049354() {
        @Override
        protected int base() {
          return mN;
        }
      });
    }
    return mA.next();
  }
}
