package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A109405 a(2) = 36; for n &gt;= 3, a(n) = 2^a(n-1) mod 10^n.
 * @author Georg Fischer
 */
public class A109405 extends Sequence2 {

  private Z mA = Z.valueOf(36);
  private Z mTens = Z.valueOf(100);

  @Override
  public Z next() {
    final Z result = mA;
    mTens = mTens.multiply(10);
    mA = Z.TWO.modPow(mA, mTens);
    return result;
  }
}
