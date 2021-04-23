package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010765 a(n) = floor(n/2)^floor(n/3).
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
