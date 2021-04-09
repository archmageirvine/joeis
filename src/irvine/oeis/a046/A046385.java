package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a033.A033620;
import irvine.util.array.LongDynamicArray;
import irvine.util.string.StringUtils;

/**
 * A046385 Smallest palindrome with exactly n palindromic prime factors (counted with multiplicity), and no other prime factors.
 * @author Sean A. Irvine
 */
public class A046385 extends A033620 {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      final Z t = super.next();
      if (StringUtils.isPalindrome(t.toString())) {
        final long omega = Cheetah.factor(t).bigOmega();
        if (mA.get(omega) == null) {
          mA.set(omega, t);
        }
      }
    }
    return mA.get(mN);
  }
}
