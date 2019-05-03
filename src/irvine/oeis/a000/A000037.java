package irvine.oeis.a000;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000037 Numbers that are not squares <code>(or</code>, the <code>nonsquares)</code>.
 * @author Sean A. Irvine
 */
public class A000037 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final long s = LongUtils.sqrt(++mN);
      if (s * s != mN) {
        break;
      }
    }
    return Z.valueOf(mN);
  }
}

