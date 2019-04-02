package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A145768 a(n) = the bitwise XOR of squares of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A145768 implements Sequence {

  protected long mN = -1;
  private Z mXor = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mXor = mXor.xor(Z.valueOf(mN).square());
    return mXor;
  }

}

