package irvine.oeis.a034;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a020.A020760;
import irvine.oeis.a020.A020787;

/**
 * A034982 a(n)^2 is smallest square starting with a string of n 3's.
 * @author Sean A. Irvine
 */
public class A034982 implements Sequence {

  private final Sequence mASeq;
  private final Sequence mBSeq;
  private final String mAppend;
  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private String mPrefix;
  private Z mPrev = Z.ZERO;

  protected A034982(final Sequence a, final Sequence b, final String append, final String initial) {
    mASeq = a;
    mBSeq = b;
    mAppend = append;
    mPrefix = initial;
  }

  /** Construct the sequence. */
  public A034982() {
    // 1/sqrt(3), 1/sqrt(30)
    this(new A020787(), new A020760(), "3", "");
  }

  @Override
  public Z next() {
    if (mPrefix == null) {
      mPrefix = "";
      return Z.ONE;
    }
    mPrefix = mPrefix + mAppend;
    if (mPrev.square().toString().startsWith(mPrefix)) {
      return mPrev;
    }
    final Z t = mPrev.add(1);
    if (t.square().toString().startsWith(mPrefix)) {
      mPrev = t;
      return mPrev;
    }
    while (true) {
      if (mA.compareTo(mB) < 0) {
        mA = mA.multiply(10).add(mASeq.next());
        final Z am1 = mA.subtract(1);
        if (am1.square().toString().startsWith(mPrefix)) {
          mPrev = am1;
          return am1;
        }
        if (mA.square().toString().startsWith(mPrefix)) {
          mPrev = mA;
          return mA;
        }
        final Z a1 = mA.add(1);
        if (a1.square().toString().startsWith(mPrefix)) {
          mPrev = a1;
          return a1;
        }
      } else {
        mB = mB.multiply(10).add(mBSeq.next());
        final Z bm1 = mB.subtract(1);
        if (bm1.square().toString().startsWith(mPrefix)) {
          mPrev = bm1;
          return bm1;
        }
        if (mB.square().toString().startsWith(mPrefix)) {
          mPrev = mB;
          return mB;
        }
        final Z b1 = mB.add(1);
        if (b1.square().toString().startsWith(mPrefix)) {
          mPrev = b1;
          return b1;
        }
      }
    }
  }
}
