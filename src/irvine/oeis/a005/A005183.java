package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005183 <code>a(n) = n*2^(n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A005183 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).shiftLeft(mN - 1).add(1);
  }
}
