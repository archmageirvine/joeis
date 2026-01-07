package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392142 allocated for Rodolfo Kurchan.
 * @author Sean A. Irvine
 */
public class A392142 extends Sequence0 {

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

