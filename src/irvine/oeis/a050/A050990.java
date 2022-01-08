package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a002.A002322;

/**
 * A050990 2-Kn\u00f6del numbers.
 * @author Sean A. Irvine
 */
public class A050990 extends A002322 {

  protected int mKnoed;
  protected Z mN = Z.ZERO;

  /** Construct the sequence. */
  public A050990() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param knoed
   */
  public A050990(int knoed) {
    mKnoed = knoed;
    mN = Z.ZERO;
    while (--knoed >= 0) {
      super.next();
    }
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(super.next()).isZero()) {
        return mN.add(mKnoed);
      }
    }
  }
}
