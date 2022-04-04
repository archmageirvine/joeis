package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A055727 Number of lucky 4,6 triples &lt;= 10^n.
 * @author Sean A. Irvine
 */
public class A055727 implements Sequence {

  private final Sequence mLucky26 = new A000959() {

    private Z mA = super.next();
    private Z mB = super.next();

    @Override
    public Z next() {
      while (true) {
        final Z t = mA;
        mA = mB;
        mB = super.next();
        if (mA.subtract(4).equals(t) && mB.subtract(6).equals(t)) {
          return t;
        }
      }
    }
  };

  private long mLimit = 0;
  private long mCount = 0;
  private Z mA = mLucky26.next();

  @Override
  public Z next() {
    mLimit = mLimit == 0 ? 1 : mLimit * 10;
    while (mA.longValueExact() <= mLimit) {
      ++mCount;
      mA = mLucky26.next();
    }
    return Z.valueOf(mCount);
  }
}
