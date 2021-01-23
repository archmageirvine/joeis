package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004274 0, 2 and the odd numbers.
 * @author Sean A. Irvine
 */
public class A004274 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += mN < 3 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
