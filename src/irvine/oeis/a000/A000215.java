package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000215 Fermat numbers: <code>a(n) = 2^(2^n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A000215 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
    } else {
      mN <<= 1;
      if (mN < 0) {
        throw new UnsupportedOperationException();
      }
    }
    return Z.ONE.shiftLeft(mN).add(1);
  }
}
