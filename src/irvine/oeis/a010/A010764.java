package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010764.
 * @author Sean A. Irvine
 */
public class A010764 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf((mN / 2) % (mN / 3));
  }
}
