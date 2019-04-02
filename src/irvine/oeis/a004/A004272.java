package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004272 1, 3, 5 and the even numbers.
 * @author Sean A. Irvine
 */
public class A004272 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += mN < 6 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
