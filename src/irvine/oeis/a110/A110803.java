package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110803 n times the number of digits in the decimal expansion of n.
 * @author Georg Fischer
 */
public class A110803 implements Sequence {

  private Z mK = Z.ZERO;

  @Override
  public Z next() {
    mK = mK.add(1);
    return mK.multiply(mK.toString().length());
  }
}
