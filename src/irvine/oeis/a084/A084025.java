package irvine.oeis.a084;

import java.util.LinkedList;

import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A083123 Smallest n-digit palindromic multiple of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084025 extends Sequence1 {

  private final LinkedList<Z> mA = new LinkedList<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mN == 1) {
        return Z.ONE;
      }
      if (mN % 10 == 0) {
        for (int k = 0; k < mN; ++k) {
          mA.add(Z.ZERO);
        }
      } else {
        final Sequence palins = new LengthPalindromes(mN);
        while (mA.size() < mN) {
          final Z p = palins.next();
          if (p == null) {
            while (mA.size() < mN) {
              mA.add(Z.ZERO);
            }
          } else if (p.mod(mN) == 0) {
            mA.add(p.divide(mN));
          }
        }
      }
    }
    return mA.pollFirst();
  }
}

