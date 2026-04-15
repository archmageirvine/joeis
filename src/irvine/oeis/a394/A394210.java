package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394210 allocated for J. Lowell.
 * @author Sean A. Irvine
 */
public class A394210 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1; // todo I think this should start at 0 to allow a(1)=2 -- see pink box discussion
    while (true) {
      final Z t = Z.valueOf(++k).shiftLeft(mN);
      if (Functions.GPF.z(t).compareTo(Functions.GPF.z(t.subtract(1))) > 0) {
        return t;
        //return Z.valueOf(k);
      }
    }
  }
}
