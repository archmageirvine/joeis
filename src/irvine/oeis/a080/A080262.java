package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001597;

/**
 * A080262 Cunningham numbers: of the form a^b +- 1, where a, b &gt;= 2.
 * @author Sean A. Irvine
 */
public class A080262 extends Sequence1 {

  private static final long[] SMALL = {3, 5, 7, 8, 9, 10, 15, 17, 24};
  private int mN = 0;
  private final Sequence mSeq = new A001597().skip(6);
  private Z mA = null;
  private boolean mAdd = true;

  @Override
  public Z next() {
    if (mN < SMALL.length) {
      return Z.valueOf(SMALL[mN++]);
    }
    mAdd = !mAdd;
    if (mAdd) {
      return mA.add(1);
    }
    mA = mSeq.next();
    return mA.subtract(1);
  }
}

