package irvine.oeis.a127;
// manually 2021-09-29

import irvine.math.z.Z;

/**
 * A127263 Numbers k such that k^3 divides 2^(k^2)+1. 
 * @author Georg Fischer
 */
public class A127263 extends A127103 {

  /** Construct the sequence. */
  public A127263() {
    this(3, 2, 1);
  }

  /**
   * Generic constructor with parameters: k^parm1 divides parm2^(k^2) + parm3
   * @param parm1 power of k
   * @param parm2 base
   * @param parm3 additive term
   */
  public A127263(final int parm1, final int parm2, final int parm3) {
    super(parm1, parm2, parm3);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z n2 = n.square();
      final Z mod = n.pow(mParm1);
      final Z t = mParm2.modPow(n2, mod);
      if (t.add(mod.add(mParm3)).mod(mod).isZero()) {
        return n;
      }
    }
  }
}
