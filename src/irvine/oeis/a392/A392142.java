package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392142 Starting with a(1) = 1, each term is obtained by doubling the previous term and then deleting repeated digits, keeping only the first occurrence of each digit.
 * @author Sean A. Irvine
 */
public class A392142 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    final String t = mA.multiply2().toString();
    int syn = 0;
    mA = Z.ZERO;
    for (int k = 0; k < t.length(); ++k) {
      final int v = t.charAt(k) - '0';
      if ((syn & (1 << v)) == 0) {
        syn |= 1 << v;
        mA = mA.multiply(10).add(v);
      }
    }
    return mA;
  }
}

