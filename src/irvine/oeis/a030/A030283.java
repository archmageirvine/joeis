package irvine.oeis.a030;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030283 a(0) = 0; for n&gt;0, a(n) is the smallest number greater than a(n-1) which does not use any digit used by a(n-1).
 * @author Sean A. Irvine
 */
public class A030283 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else if (mA.isZero()) {
      mA = Z.ONE; // save mucking around with 0
    } else {
      final ArrayList<Integer> digits = new ArrayList<>();
      Z t = mA;
      int syndrome = ZUtils.syn(t);
      while (!t.isZero()) {
        digits.add((int) (t.mod(10)));
        t = t.divide(10);
      }
      // increment leading digit
      int r = digits.get(digits.size() - 1) + 1;
      // There are extra constraints, e.g. 0 might be already used
      while ((LongUtils.syndrome(r) & syndrome) != 0) {
        ++r;
      }

      mA = Z.valueOf(r);
      // find smallest unused digit
      long d = 0;
      while ((syndrome & 1) == 1) {
        ++d;
        syndrome >>>= 1;
      }
      for (int k = digits.size() - 2; k >= 0; --k) {
        mA = mA.multiply(10).add(d);
      }
    }
    return mA;
  }
}
