package irvine.oeis.a051;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051775 Table <code>T(n,m) = Nim-product</code> of n and m, read by antidiagonals, for <code>n &gt;= 0, m &gt;= 0</code>.
 * @author Sean A. Irvine
 */
public class A051775 extends MemoryFunction2<Z, Z> implements Sequence {

  // After R. J. Mathar

  private static Z nimSum(final Z a, final Z b) {
    return a.xor(b);
  }

  private class NimProductPowerOf2 extends MemoryFunction2<Integer, Z> {

    @Override
    protected Z compute(final Integer nlog2, final Integer mlog2) {
      if ((nlog2 & mlog2) == 0) {
        return Z.ONE.shiftLeft(nlog2 + mlog2);
      }
      final int a2;
      final int b2;
      if (nlog2 >= mlog2) {
        a2 = nlog2;
        b2 = mlog2;
      } else {
        a2 = mlog2;
        b2 = nlog2;
      }
      Z a = Z.ONE.shiftLeft(nlog2 ^ mlog2);
      for (int j = 1; j <= b2; j <<= 1) {
        if ((a2 & j) != 0 && (b2 & j) != 0) {
          a = A051775.this.get(a, Z.THREE.shiftLeft(j - 1));
        }
      }
      return a;
    }
  }

  private final NimProductPowerOf2 mPower2 = new NimProductPowerOf2();

  @Override
  protected Z compute(final Z n, final Z m) {
    if (n.multiply(m).equals(Z.ZERO)) {
      return Z.ZERO;
    } else if (Z.ONE.equals(n) || Z.ONE.equals(m)) {
      return n.multiply(m);
    }
    Z a = Z.ZERO;
    final String nbin = n.toString(2);
    final String mbin = m.toString(2);
    for (int nlog2 = 0; nlog2 < nbin.length(); ++nlog2) {
      if (nbin.charAt(nbin.length() - 1 - nlog2) == '1') {
        for (int mlog2 = 0; mlog2 < mbin.length(); ++mlog2) {
          if (mbin.charAt(mbin.length() - 1 - mlog2) == '1') {
            a = nimSum(a, mPower2.get(nlog2, mlog2));
          }
        }
      }
    }
    return a;
  }

  private Z mN = Z.NEG_ONE;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mM = mM.subtract(1);
    if (mM.signum() < 0) {
      mN = mN.add(1);
      mM = mN;
    }
    return get(mN.subtract(mM), mM);
  }
}
