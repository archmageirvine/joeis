package irvine.oeis.a002;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A002202 Values taken by totient function phi(m) (A000010).
 * @author Sean A. Irvine
 */
public class A002202 extends AbstractSequence {

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
      if (!Euler.inversePhi(mN).isEmpty()) {
        return mN;
      }
    }
  }
}
