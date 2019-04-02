package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004271 1, 3 and the nonnegative even numbers.
 * @author Sean A. Irvine
 */
public class A004271 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += mN < 4 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
