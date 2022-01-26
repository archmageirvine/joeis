package irvine.oeis.a229;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A229220 a(n) = a(n-1)^2 + (-1)^n with a(1)=1.
 * @author Georg Fischer
 */
public class A229220 implements Sequence {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A229220() {
    mN = 0;
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA;
    }
    mA = mA.square().add((mN & 1) == 0 ? 1 : -1);
    return mA;
  }
}
