package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004273 0 together with odd numbers.
 * @author Sean A. Irvine
 */
public class A004273 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += mN < 1 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
