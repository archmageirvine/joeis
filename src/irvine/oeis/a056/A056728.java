package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A056728 Palindromic primes using only two distinct digits and only the exterior digit is different.
 * @author Sean A. Irvine
 */
public class A056728 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      for (char d = '0'; d <= '9'; ++d) {
        final String core = StringUtils.rep(d, mN);
        for (char t = '1'; t <= '9'; t += 2) {
          if (t != 5 && t != d) {
            final Z u = new Z(t + core + t);
            if (u.isProbablePrime()) {
              mA.add(u);
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
