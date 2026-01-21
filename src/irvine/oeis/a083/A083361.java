package irvine.oeis.a083;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A083361 Subsequence of sequence A083359 in which every prime factor can be found in the number at least as often as it is factor of the number.
 * @author Sean A. Irvine
 */
public class A083361 extends A083359 {

  private boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final String s = n.toString();
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final String q = p.toString();
      int cnt = 0;
      for (int k = s.indexOf(q); k >= 0; k = s.indexOf(q, k + 1)) {
        if (++cnt >= e) {
          break;
        }
      }
      if (cnt < e) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z c = super.next();
      if (is(c)) {
        return c;
      }
    }
  }
}
