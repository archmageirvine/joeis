package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004279 <code>1, 3, 5</code> and the even numbers.
 * @author Sean A. Irvine
 */
public class A004279 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += mN < 6 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
