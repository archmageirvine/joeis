package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045815 In the list of divisors of <code>n (in</code> base 6), each digit <code>0-5</code> appears equally often.
 * @author Sean A. Irvine
 */
public class A045815 implements Sequence {

  private long mN = 2728;

  static int matchingCount(final Z[] d, final int base) {
    final int[] count = new int[base];
    for (final Z z : d) {
      final String s = z.toString(base);
      for (int k = 0; k < s.length(); ++k) {
        count[s.charAt(k) - '0']++;
      }
    }
    final int v = count[0];
    for (int k = 1; k < count.length; ++k) {
      if (count[k] != v) {
        return 0;
      }
    }
    return v;
  }

  @Override
  public Z next() {
    while (true) {
      if (matchingCount(Cheetah.factor(++mN).divisors(), 6) > 0) {
        return new Z(Z.valueOf(mN).toString(6)); // ugly write out in base 6
      }
    }
  }
}
