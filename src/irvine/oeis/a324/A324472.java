package irvine.oeis.a324;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A324472 a(n) = 1000 mod n.
 * @author Georg Fischer
 */
public class A324472 implements Sequence {

  protected Z mN;
  protected Z mParm;

  /**
   * Construct the sequence.
   */
  public A324472() {
    mN = Z.ZERO; // offset = 1
    mParm = Z.valueOf(1000);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.equals(Z.ZERO) ? Z.ZERO : mParm.mod(mN);
  }
}
