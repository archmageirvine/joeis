package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059707 If all digits have the same parity, stop; otherwise write down the number formed by the even digits and the number formed by the odd digits and multiply them; repeat.
 * @author Sean A. Irvine
 */
public class A059707 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    while (true) {
      final int s = Functions.SYNDROME.i(m);
      if ((s & 0b1010101010) == 0 || (s & 0b101010101) == 0) {
        return Z.valueOf(m);
      }
      long e = 0;
      long o = 0;
      final String sm = String.valueOf(m);
      for (int k = 0; k < sm.length(); ++k) {
        final int c = sm.charAt(k) - '0';
        if ((c & 1) == 0) {
          e *= 10;
          e += c;
        } else {
          o *= 10;
          o += c;
        }
        m = e * o;
      }
    }
  }
}

