package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060873 Intrinsic 3-palindromes: n is an intrinsic k-palindrome if it is a k-digit palindrome in some base.
 * @author Sean A. Irvine
 */
public class A060873 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mBase = 2;

  @Override
  public Z next() {
    if (mA.isEmpty() || mBase * mBase <= mA.first()) {
      for (long a = 1; a < mBase; ++a) {
        for (long b = 0; b < mBase; ++b) {
          mA.add((a * mBase + b) * mBase + a);
        }
      }
      ++mBase;
    }
    return Z.valueOf(mA.pollFirst());
  }
}
