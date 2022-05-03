package irvine.oeis.a056;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A056710.
 * @author Sean A. Irvine
 */
public class A056710 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mN;
      for (char d = '1'; d <= '9'; ++d) {
        final String core = StringUtils.rep(d, mN);
        for (char t = '1'; t <= '9'; ++t) {
          if (t != d) {
            final Z u = new Z(t + core);
            if (u.isProbablePrime()) {
              mA.add(u);
            }
            if ((t & 1) != 0 && t != '5') {
              final Z v = new Z(core + t);
              if (v.isProbablePrime()) {
                mA.add(v);
              }
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
