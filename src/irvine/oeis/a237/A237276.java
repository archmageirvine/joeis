package irvine.oeis.a237;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A237276 Numbers k such that A000041(k) == 1 (mod 3).
 * @author Georg Fischer
 */
public class A237276 extends A000041 {

  private int mN;
  private Z mRes;
  private Z mMod;

  /** Construct the sequence. */
  public A237276() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param res residue
   * @param mod modulus
   */
  public A237276(final int res, final int mod) {
    mN = -1;
    mRes = Z.valueOf(res);
    mMod = Z.valueOf(mod);
    if (res == 1) { // for A237276, A273279:
      ++mN;
      super.next();
    }
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(mMod).equals(mRes)) {
        return Z.valueOf(mN);
      }
    }
  }
}
