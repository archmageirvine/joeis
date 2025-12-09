package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391164 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A391164 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN % 10 == 6) {
      mN += 4;
    }
    return Z.valueOf(mN);
  }
}

