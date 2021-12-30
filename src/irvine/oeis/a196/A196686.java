package irvine.oeis.a196;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A196686 Excess of number of odd digits over even digits of Pi.
 * @author Georg Fischer
 */
public class A196686 extends A000796 {

  protected long mEven = 0L;
  protected long mOdd = 0L;

  @Override
  public Z next() {
    if ((super.next().intValue() & 1) == 0) {
      ++mEven;
    } else {
      ++mOdd;
    }
    return Z.valueOf(mOdd - mEven);
  }
}
