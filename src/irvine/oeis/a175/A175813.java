package irvine.oeis.a175;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A175813 Numbers n such that the first n decimal digits of Pi contain equal numbers of even and odd decimal digits.
 * @author Georg Fischer
 */
public class A175813 extends A000796 {

  protected int mM = 0;
  protected long mEven = 0L;
  protected long mOdd = 0L;

  @Override
  public Z next() {
    while (true) {
      ++mM;
      if ((super.next().intValue() & 1) == 0) {
        ++mEven;
      } else {
        ++mOdd;
      }
      if (mEven == mOdd) {
        return Z.valueOf(mM);
      }
    }
  }
}
