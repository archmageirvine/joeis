package irvine.oeis.a051;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A051775 Table T(n,m) = Nim-product of n and m, read by antidiagonals, for n &gt;= 0, m &gt;= 0.
 * @author Sean A. Irvine
 */
public class A051775 extends MemoryFunction2Sequence<Z, Z> {

  /** Construct the sequence. */
  public A051775() {
    this(0);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A051775(final int offset) {
    super(offset);
  }

  // After R. J. Mathar

  protected static Z nimSum(final Z a, final Z b) {
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
    if (n.multiply(m).isZero()) {
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

  protected Z nimMultiply(final long n, final long m) {
    return get(Z.valueOf(n), Z.valueOf(m));
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
