package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A132337 Sum of the integers from 1 to <code>n,</code> excluding the perfect sixth powers.
 * @author Sean A. Irvine
 */
public class A132337 implements Sequence {

  private Z mSum = Z.ZERO;
  private long mN = 0;
  private long mM = 1;
  private long mF = 1;

  @Override
  public Z next() {
    if (++mN == mF) {
      final long a = ++mM * mM;
      mF = a * a * a;
    } else {
      mSum = mSum.add(mN);
    }
    return mSum;
  }
}
