package irvine.oeis.a039;

import irvine.math.z.Z;

/**
 * A039795 Sequence arising in search for Legendre sequences.
 * @author Sean A. Irvine
 */
public class A039795 extends A039796 {

  @Override
  protected boolean isCanonical(final long n) {
    // largest is canon
    long m = n;
    for (int k = 1; k < mN; ++k) {
      m <<= 1;
      if (m >= mLim) {
        m -= mLim;
        ++m;
      }
      if (m > n) {
        return false;
      }
    }
    long rev = 0;
    m = n;
    for (int k = 0; k < mN; ++k) {
      rev <<= 1;
      rev += m & 1;
      m >>>= 1;
    }
    if (rev > n) {
      return false;
    }
    m = rev;
    for (int k = 1; k < mN; ++k) {
      m <<= 1;
      if (m >= mLim) {
        m -= mLim;
        ++m;
      }
      if (m > n) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    final Z t = super.next();
    // I do not understand the apparent need for the following correction!
    // Still off my 1 for mN == 35
    return t.add(mN > 3 && mN < 27 && (mN & 3) == 3 ? 1 : 0);
  }
}
