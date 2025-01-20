package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074336 a(1) = 1; a(n) is smallest number &gt; a(n-1) such that the juxtaposition a(1)a(2)...a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A074336 extends Sequence1 {

  private Z mCat = null;
  private long mN;
  private long mM = 10;

  protected A074336(final long start) {
    mN = start;
    while (mN >= mM) {
      mM *= 10;
    }
  }

  /** Construct the sequence. */
  public A074336() {
    this(1);
  }

  @Override
  public Z next() {
    if (mCat == null) {
      mCat = Z.valueOf(mN);
    } else {
      mCat = mCat.multiply(mM);
      while (true) {
        if (++mN == mM) {
          mM *= 10;
          mCat = mCat.multiply(10);
        }
        final Z t = mCat.add(mN);
        if (t.isProbablePrime()) {
          mCat = t;
          break;
        }
      }
    }
    return Z.valueOf(mN);
  }
}
