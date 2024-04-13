package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062946 Numbers that have a larger multiple which differs in just one digit from its reverse.
 * @author Sean A. Irvine
 */
public class A062946 extends Sequence1 {

  private long mN = 0;

  private boolean is(final String a, final String b) {
    assert a.length() == b.length();
    boolean ok = false;
    for (int k = 0; k < a.length(); ++k) {
      if (a.charAt(k) != b.charAt(k)) {
        if (ok) {
          return false;
        }
        ok = true;
      }
    }
    return ok;
  }

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      final String rev = Long.toString(Functions.REVERSE.l(n));
      final int nLen = Long.toString(mN).length();
      if (rev.length() == nLen) {
        long k = 1;
        String kn;
        while ((kn = String.valueOf(++k * mN)).length() == nLen) {
          if (is(kn, rev)) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}

