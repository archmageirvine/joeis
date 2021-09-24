package irvine.oeis.a051;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.MutableInteger;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A051641 Palindromic binomial coefficients C(n,k) for k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A051641 implements Sequence {

  private final TreeMap<Z, MutableInteger> mPriority = new TreeMap<>();
  private long mN = 2;
  {
    mPriority.put(Z.THREE, new MutableInteger(1));
  }

  @Override
  public Z next() {
    while (mPriority.isEmpty() || Binomial.binomial(mN, 2).compareTo(mPriority.firstKey()) <= 0) {
      for (long k = 2; k <= mN / 2; ++k) {
        final Z t = Binomial.binomial(mN, k);
        if (StringUtils.isPalindrome(t.toString())) {
          final MutableInteger cnt = mPriority.get(t);
          if (cnt != null) {
            cnt.postIncrement();
          } else {
            mPriority.put(t, new MutableInteger(1));
          }
        }
      }
      ++mN;
    }
    final Map.Entry<Z, MutableInteger> e = mPriority.firstEntry();
    if (e.getValue().get() > 1) {
      e.getValue().postDecrement();
    } else {
      mPriority.pollFirstEntry();
    }
    return e.getKey();
  }
}
