package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010765.
 * @author Sean A. Irvine
 */
public class A010765 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2).pow(mN / 3);
  }
}
