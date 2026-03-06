package irvine.oeis.a084;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084029 Triangle read by rows: n-th row contains the first n n-digit multiples of n with digit sum n. If there are fewer than n such numbers, the rest of the row is filled with 0's.
 * @author Sean A. Irvine
 */
public class A084029 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  protected int mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      final Z s = Z.TEN.pow(mN - 1);
      final Z lim = s.multiply(10);
      Z k = s.divide(mN).multiply(mN);
      while (mA.size() < mN) {
        if (k.compareTo(lim) >= 0) {
          while (mA.size() < mN) {
            mA.add(Z.ZERO);
          }
        } else if (k.compareTo(s) >= 0 && k.mod(mN) == 0 && Functions.DIGIT_SUM.i(k) == mN) {
          mA.add(k);
        }
        k = k.add(mN);
      }
    }
    return mA.pollFirst();
  }
}

