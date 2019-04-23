package irvine.oeis.a298;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A298036.
 * @author Sean A. Irvine
 */
public class A298036 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(mN).multiply(6).multiply(1 + (mN & 1));
  }
}
