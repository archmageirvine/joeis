package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a070.A070887;

/**
 * A071013.
 * @author Sean A. Irvine
 */
public class A071048 extends Sequence0 {

  private final Sequence mA = new A070887();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if (mA.next().isZero()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
