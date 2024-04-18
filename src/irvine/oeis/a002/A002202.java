package irvine.oeis.a002;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002202 Values taken by totient function phi(m) (A000010).
 * @author Sean A. Irvine
 */
public class A002202 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A002202(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A002202() {
    super(1);
  }

  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ONE;
    }
    while (true) {
      mN = mN.add(2);
      if (!InverseEuler.inversePhi(mN).isEmpty()) {
        return mN;
      }
    }
  }
}
