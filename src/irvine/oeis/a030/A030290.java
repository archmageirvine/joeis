package irvine.oeis.a030;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030290 a(n) is the smallest k &gt; a(n-1) such that k^3 has no digit in common with a(n-1)^3.
 * @author Sean A. Irvine
 */
public class A030290 implements Sequence {

  private Z mA = null;
  private int mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else if (Z.ZERO.equals(mA)) {
      mA = Z.ONE;
    } else if (++mN >= 24 && (mN & 1) == 0) {
      mA = Z.TEN.pow(mN / 2 - 6); // Observed pattern
    } else {
      final ArrayList<Integer> digits = new ArrayList<>();
      Z t = mA.pow(3);
      final int syndrome = ZUtils.syn(t);
      while (!Z.ZERO.equals(t)) {
        digits.add((int) (t.mod(10)));
        t = t.divide(10);
      }
      // increment leading digit
      int r = digits.get(digits.size() - 1) + 1;
      // There are extra constraints, e.g. 0 might be already used
      while ((LongUtils.syndrome(r) & syndrome) != 0) {
        ++r;
      }

      Z m = Z.valueOf(r);
      // find smallest unused digit
      long d = 0;
      int s = syndrome;
      while ((s & 1) == 1) {
        ++d;
        s >>>= 1;
      }
      for (int k = digits.size() - 2; k >= 0; --k) {
        m = m.multiply(10).add(d);
      }
      // We now have m > mA^2 with no digits in common with mA^2
      Z cbrt = m.root(3);
      if (m.auxiliary() == 0) {
        // Need to be >= m
        cbrt = cbrt.add(1);
      }
      mA = mA.max(cbrt);
      // Now we just need to obey the syndrome constraint
      while ((ZUtils.syn(mA.pow(3)) & syndrome) != 0) {
        mA = mA.add(1);
      }
    }
    return mA;
  }
}
