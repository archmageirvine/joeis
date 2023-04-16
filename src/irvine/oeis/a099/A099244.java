package irvine.oeis.a099;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A099244 Greatest common divisor of length of n in binary representation and its number of ones.
 * @author Georg Fischer
 */
public class A099244 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Z.valueOf(IntegerUtils.gcd(n.bitLength(), n.bitCount()));
  }
}
