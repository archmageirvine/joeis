package irvine.oeis.a060;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060554 String together the first n numbers in an order which maximizes the result.
 * @author Sean A. Irvine
 */
public class A060554 extends Sequence1 {

  private long mN = 0;
  private long mT = 1;
  private final ArrayList<Long> mA = new ArrayList<>();

  private boolean isRep(long n) {
    if (n < 11) {
      return false;
    }
    final long d = n % 10;
    n /= 10;
    while (n != 0) {
      if (n % 10 != d) {
        return false;
      }
      n /= 10;
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == mT) {
      // Power of 10 add at end
      mA.add(mN);
      mT *= 10;
    } else {
      final long prev = isRep(mN) ? mN / 10 : mN - 1;
      for (int k = 0; k < mA.size(); ++k) {
        if (mA.get(k) == prev) {
          mA.add(k, mN);
          break;
        }
      }
    }
    final StringBuilder sb = new StringBuilder();
    for (final long v : mA) {
      sb.append(v);
    }
    return new Z(sb);
  }
}

