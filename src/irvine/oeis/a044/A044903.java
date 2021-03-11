package irvine.oeis.a044;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A044903 Base-2 run lengths alternate: odd, even, odd, ...
 * @author Sean A. Irvine
 */
public class A044903 implements Sequence {

  private long mN = 0;

  protected int base() {
    return 2;
  }

  private boolean is(final long n) {
    final String s = Long.toString(n, base());
    boolean expectEven = false;
    char prev = '\0';
    int len = 0;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) == prev) {
        ++len;
      } else {
        if (len > 0) {
          final boolean even = (len & 1) == 0;
          if (even != expectEven) {
            return false;
          }
          expectEven = !expectEven;
        }
        len = 1;
        prev = s.charAt(k);
      }
    }
    return (len & 1) == 0 == expectEven;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

