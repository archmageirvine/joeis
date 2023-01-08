package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060947 Intrinsic 10-palindromes: n is an intrinsic k-palindrome if it is a k-digit palindrome in some base.
 * @author Sean A. Irvine
 */
public class A060947 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mBase = 2;

  @Override
  public Z next() {
    if (mA.isEmpty() || mBase * mBase * mBase * mBase <= mA.first()) {
      for (long a = 1; a < mBase; ++a) {
        for (long b = 0; b < mBase; ++b) {
          for (long c = 0; c < mBase; ++c) {
            for (long d = 0; d < mBase; ++d) {
              for (long e = 0; e < mBase; ++e) {
                mA.add(((((((((((a * mBase + b) * mBase + c) * mBase + d) * mBase + e) * mBase) + e) * mBase + d) * mBase) + c) * mBase + b) * mBase + a);
              }
            }
          }
        }
      }
      ++mBase;
    }
    return Z.valueOf(mA.pollFirst());
  }
}
