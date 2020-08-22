package irvine.oeis.a030;

import java.util.ArrayList;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A030284 a(n) is the least prime &gt; a(n-1) whose digits do not appear in a(n-1).
 * @author Sean A. Irvine
 */
public class A030284 implements Sequence {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final ArrayList<Integer> digits = new ArrayList<>();
    Z t = mA;
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

    mA = Z.valueOf(r);
    // find smallest unused digit
    long d = 0;
    int s = syndrome;
    while ((s & 1) == 1) {
      ++d;
      s >>>= 1;
    }
    for (int k = digits.size() - 2; k >= 0; --k) {
      mA = mA.multiply(10).add(d);
    }
    // Now we just need to get a prime
    while (!mA.isProbablePrime()) {
      do {
        mA = mA.add(1);
      } while ((ZUtils.syn(mA) & syndrome) != 0);
    }
    return mA;
  }
}
