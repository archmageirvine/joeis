package irvine.oeis.a242;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A242427 n! mod n^3.
 * @author Georg Fischer
 */
public class A242427 implements Sequence {

  private int mN = 0;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mFact = mFact.multiply(mN);
    return mFact.mod(Z.valueOf(mN).multiply(mN).multiply(mN));
  }
}
