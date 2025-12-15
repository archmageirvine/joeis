package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A082586 Length of the run of consecutive equal digits in the decimal expansion of Pi beginning at position n and ignoring any immediately-previous equal digits.
 * @author Sean A. Irvine
 */
public class A082586 extends Sequence1 {

  private final Sequence mPi = new A000796();
  private Z mT = mPi.next();
  private long mCount = 1;

  @Override
  public Z next() {
    if (mCount > 1) {
      return Z.valueOf(--mCount);
    }
    final Z v = mT;
    while (true) {
      mT = mPi.next();
      if (!mT.equals(v)) {
        break;
      }
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
